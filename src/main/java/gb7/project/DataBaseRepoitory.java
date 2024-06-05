package gb7.project;

import gb7.project.entity.Weather;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseRepoitory {
    private static String DB_URL = "jdbc:postgresql://localhost:5432/postgres?currentSchema=weather";
    private static String username = "postgres";
    private static String password = "1380";
    String insertWeatherInfo= "insert into weather(location, weather_text, degrees) values (?, ?, ?)";

    static {
        try {
            Class.forName("org.postgresql.Driver");
            //connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres");
            //String url = "jdbc:postgresql://localhost:5432/postgres?currentSchema=students";


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void saveWeather(Weather weather) {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement(insertWeatherInfo);
            preparedStatement.setString(1, weather.getLocation());
            preparedStatement.setString(2, weather.getWeatherText());
            preparedStatement.setInt(3, weather.getDegrees());
            preparedStatement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

