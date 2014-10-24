package observer;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author etjenkins
 */
public class CurrentConditionsDisplay implements Observer {
	Observable observable;
	private float temp;
	private float humidity;
	private float pressure;

	public CurrentConditionsDisplay(Observable o) {
		this.observable = o;
		o.addObserver(this);
	}

	public void update(Observable o, Object o1) {
		if(o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)o;
			this.temp = weatherData.getTemp();
			this.humidity = weatherData.getHumidity();
			this.pressure = weatherData.getPressure();
			display();
		}
	}

	public void display() {
		System.out.println("Current conditions - Temperature: " + temp + ", Humidity: " + humidity + " , Pressure: " + pressure);
	}

}
