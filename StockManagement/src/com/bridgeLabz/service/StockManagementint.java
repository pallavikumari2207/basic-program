package com.bridgeLabz.service;

public interface StockManagementint {
	public void addstock();

	void getTotalPriceByName();
	public void buy(int stockShare, String stockName);
	public void sell(int stock_Share, String stock_Name);
	void display();

}
