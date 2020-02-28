package com.bridgeLabz.Runner;

import java.util.Scanner;

import com.bridgeLabz.service.StockManagementint;
import com.bridgeLabz.service.implstockManagement;

public class StockManagementMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("-----------------Stock Report-------------------");
		System.out.println(
				"press 1 for adding stock \n press 4 to display \n press 3 to get total price of stock by name\n press 4 to buy a stock\n press 5 to sell a stock\n press 6 to see stockinlinkendlist press 7 to exit\n");
		StockManagementint stockvalue = new implstockManagement();
		boolean isExit = false;
		while (!isExit) {
			System.out.println("enter choice");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("add stock");
				stockvalue.addstock();
				break;
			case 2:
				System.out.println("display");
				stockvalue.display();
				break;
			case 3:
				System.out.println("value of stock:");
				stockvalue.getTotalPriceByName();
				break;
			case 4:
				System.out.println("enter stockShare u want to buy\n");
				int stockShare = scan.nextInt();
				System.out.println("enter stockName:\n");
				String stockName = scan.next();
			stockvalue.buy(stockShare, stockName);
			break;
			case 5:
				System.out.println("enter stockShare u want to sell\n");
				int stock_Share = scan.nextInt();
				System.out.println("enter stockName:\n");
				String stock_Name = scan.next();
				stockvalue.sell(stock_Share, stock_Name);
				break;
			case 6:System.out.println("linkedlist:");
			implstockManagement.stockLinkedList();
			case 7:
				isExit = true;
				break;
			default:
				return;

			}
		}

	}

}
