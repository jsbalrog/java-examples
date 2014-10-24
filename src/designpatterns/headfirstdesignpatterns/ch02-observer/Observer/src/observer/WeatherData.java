package observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jenkinset
 */
public class WeatherData implements Subject {
	public List<Observer> observers;
	private float temp;
	private float humidity;
	private float pressure;

	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	public void notifyObservers() {
		for(Observer obs : observers) {
			obs.update(temp, humidity, pressure);
		}
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
