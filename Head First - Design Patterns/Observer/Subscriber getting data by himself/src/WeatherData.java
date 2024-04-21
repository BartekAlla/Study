import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Publisher {
    private List<Subscriber> subscribers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        subscribers = new ArrayList<Subscriber>();
    }

    @Override
    public void addSubscriber(Subscriber sub) {
        subscribers.add(sub);
    }

    @Override
    public void removeSubscriber(Subscriber sub) {
        subscribers.remove(sub);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber sub : subscribers) {
            sub.update();
        }
    }

    public void readingChanged() {
        notifySubscribers();
    }

    public void setReading(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        readingChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
