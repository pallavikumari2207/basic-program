package com.Bridgelabz.model;

public class StockManagemnt {
	private String StockName;
	private int stockShare;
	private int sharePrice;
	public int totalStockPrice()
	{
		return (this.stockShare*this.sharePrice);
		
	}
	public String getStockName() {
		return StockName;
	}
	public void setStockName(String stockName) {
		StockName = stockName;
	}
	public int getstockShare() {
		return stockShare;
	}
	public void setstockShare(int stockShare) {
		this.stockShare = stockShare;
	}
	public int getsharePrice() {
		return sharePrice;
	}
	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}
	public StockManagemnt(String stockName, int stockShare, int sharePrice) {
		super();
		StockName = stockName;
		this.stockShare = stockShare;
		this.sharePrice = sharePrice;
	}

}
