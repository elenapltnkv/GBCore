package gb7.project.entity;

public class Weather {
    //location, weatherText, degrees

    private String location;
    private String weatherText;

    public int getDegrees() {
        return degrees;
    }

    public void setDegrees(int degrees) {
        this.degrees = degrees;
    }

    public String getWeatherText() {
        return weatherText;
    }

    public void setWeatherText(String weatherText) {
        this.weatherText = weatherText;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    private int degrees;

    public Weather(String location, String weatherText, int degrees) {
        this.location = location;
        this.weatherText = weatherText;
        this.degrees = degrees;
    }
}
