package com.blz.observerPattern;

public class ForecastDisplay implements Observer{
	private float temp;
	 private WeatherStation data;
	 private subject weatherData;
	public ForecastDisplay(WeatherStation weatherData) {
		  this.data = weatherData;
		  weatherData.add(this);
		 }

	@Override
	public void update(float temp) {
		 this.temp = temp;
		 display();
		
	}

	@Override
	public void setSubject(subject sub) {
		
		this.weatherData = weatherData;
		  weatherData.add(this);
	}
	 public void display() {
		  System.out.println("Current conditions: " + temp);
		  
		 }
}
