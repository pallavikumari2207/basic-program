package com.blz.observerPattern;

public interface subject {
	public void add(Observer o);
	public void remove(Observer o);
	//public  void notify();
	public void notifyObservers();
}