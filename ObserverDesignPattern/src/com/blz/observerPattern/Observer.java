package com.blz.observerPattern;

public interface Observer {
	public void update(float temp);
	public void setSubject(subject sub);
}
