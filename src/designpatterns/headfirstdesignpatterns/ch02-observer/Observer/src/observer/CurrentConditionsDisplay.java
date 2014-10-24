package observer;

/**
 *
 * @author jenkinset
 */
public class CurrentConditionsDisplay implements Observer {
	private float temp;
	private float humidity;
	private float pressure;
	private Subject weatherData;

	@SuppressWarnings("LeakingThisInConstructor")
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	public void display() {
		System.out.println("Current conditions - Temperature: " + temp + ", Humidity: " + humidity + " , Pressure: " + pressure);
	}

}
