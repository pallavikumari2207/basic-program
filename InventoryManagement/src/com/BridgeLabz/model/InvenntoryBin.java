package com.BridgeLabz.model;

public class InvenntoryBin {
		private  String key;
		//private String name;
		private int weight;
		private int price;
		
		
		public InvenntoryBin(String key, int weight, int price) {
			super();
			this.key = key;
			this.weight = weight;
			this.price = price;
			
		}
		
		public  String getKey() {
			return key;
		}
		public String setKey(String key) {
			return this.key = key;
		}
		
		public int getWeight() {
			return weight;
		}
		public void setWeight(int weight) {
			this.weight = weight;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		
		public double getTotal() {
			return this.price*this.weight;
		}

		@Override
		public String toString() {
			return "InvenntoryBin [key=" + key + ", weight=" + weight + ", price=" + price + "]";
		}

		
	}


