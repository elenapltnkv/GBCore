package gb8;

import java.sql.*;
import java.util.Arrays;

public class PostgresEx {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        PreparedStatement preparedStatement = null;

        try {
            Class.forName("org.postgresql.Driver");
            //connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres");
            String url = "jdbc:postgresql://localhost:5432/postgres?currentSchema=students";
            String username = "postgres";
            String password = "1380";
            connection = DriverManager.getConnection(url, username, password);

            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from students");
//            for (int i = 0; i <= 100; i++) {
//                statement.executeUpdate(String.format(
//                        "insert into students (name, fac_id) values('%s', '%d')", "Student" + i, i));
//            }


            while (rs.next()) {
                System.out.print(rs.getString("name") + ",");
                System.out.print(rs.getInt("fac_id"));
            }
            int count = statement.executeUpdate("update students set name= 'Natly' where name = 'Nataliya'");
            System.out.println(count);

            preparedStatement = connection.prepareStatement("insert into students (name, fac_id) values(?, ?)");
            preparedStatement.setString(1, "Bella");
            preparedStatement.setInt(2, 6);
            preparedStatement.addBatch();

//            preparedStatement.setString(1, "Asya");
//            preparedStatement.setInt(1, 3);
//            preparedStatement.addBatch();
            preparedStatement.executeBatch();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                connection.close();
                statement.close();
                //preparedStatement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
