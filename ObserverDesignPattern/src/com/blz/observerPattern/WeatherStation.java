package com.blz.observerPattern;

import java.util.ArrayList;

public class WeatherStation implements subject{
	private ArrayList<Observer> observers;
	 private float temp;
	

	 public WeatherStation() {
		  observers = new ArrayList<>();
		 }

	@Override
	public void add(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void remove(Observer o) {
		int i = observers.indexOf(o);
		  if (i >= 0) {
		   observers.remove(i);
		  }
		
	}

	@Override
	public void notifyObservers() {
		for(int i=0;i<observers.size();i++) {
			Observer obj= observers.get(i);	
			obj.update(temp);
			
		}
	}
	public void measurementsChanged() {
		  notifyObservers();
		 }
	public void setMeasurements(float temp) {
		  this.temp = temp;
		  measurementsChanged();
	}
	public float getTemperature() {
		  return temp;
		 }
}
