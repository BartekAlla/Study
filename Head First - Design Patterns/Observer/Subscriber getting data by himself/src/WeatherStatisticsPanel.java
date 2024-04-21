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
    public void update() {
        this.temperature = this.weatherData.getTemperature();
        this.humidity = this.weatherData.getHumidity();
        this.pressure = this.weatherData.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.println("Weather statistics: statistics.");
    }
}