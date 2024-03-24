public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentWeatherConditionsPanel currentWeatherConditionsPanel = new CurrentWeatherConditionsPanel(weatherData);
        WeatherStatisticsPanel weatherStatisticsPanel = new WeatherStatisticsPanel(weatherData);
        WeatherForecastPanel weatherForecastPanel = new WeatherForecastPanel(weatherData);
        weatherData.setReading(26.6f, 65f, 1013.1f);
    }
}