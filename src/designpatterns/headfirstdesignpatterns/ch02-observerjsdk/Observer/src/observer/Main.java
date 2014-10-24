/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package observer;

/**
 *
 * @author etjenkins
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
	    CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(weatherData);
	    weatherData.setMeasurements(80, 45, 30);
	    weatherData.setMeasurements(78.3f, 33.5f, 45.6f);
    }

}
