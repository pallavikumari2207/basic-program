package com.Bridgelabz.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Transaction {
private String symbol;
private String status;
private LocalDate trancDate;
private LocalTime trancTime;
public String getSymbol() {
	return symbol;
}
public void setSymbol(String symbol) {
	this.symbol = symbol;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public LocalDate getTrancDate() {
	return trancDate;
}
public void setTrancDate(LocalDate trancDate) {
	this.trancDate = trancDate;
}
public LocalTime getTrancTime() {
	return trancTime;
}
public void setTrancTime(LocalTime trancTime) {
	this.trancTime = trancTime;
}
public Transaction(String symbol, String status, LocalDate trancDate, LocalTime trancTime) {
	super();
	this.symbol = symbol;
	this.status = status;
	this.trancDate = trancDate;
	this.trancTime = trancTime;
}


}
