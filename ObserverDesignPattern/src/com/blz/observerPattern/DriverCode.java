package com.blz.observerPattern;

public class DriverCode {
	public static void main(String[] args) {
		  WeatherStation weatherData = new WeatherStation();
		  ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		  weatherData.setMeasurements(80);
		  weatherData.setMeasurements(82);
		  weatherData.setMeasurements(78);
		 }
}
