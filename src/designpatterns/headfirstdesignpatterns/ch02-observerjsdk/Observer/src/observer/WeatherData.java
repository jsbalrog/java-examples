package observer;

import java.util.Observable;

/**
 *
 * @author etjenkins
 */
public class WeatherData extends Observable {
	private float temp;
	private float humidity;
	private float pressure;

	public WeatherData() { }

	public void measurementsChanged() {
		setChanged();
		notifyObservers(); // We're using the PULL model
	}

	public void setMeasurements(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	// Getters to be used by observers to get at data

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

	public float getTemp() {
		return temp;
	}

	public void setTemp(float temp) {
		this.temp = temp;
	}

}
