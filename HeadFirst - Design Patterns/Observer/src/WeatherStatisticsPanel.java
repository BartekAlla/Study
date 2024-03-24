public class WeatherStatisticsPanel implements Subscriber, Panel {
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public WeatherStatisticsPanel(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addSubscriber(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Weather statistics: statistics.");
    }
}
