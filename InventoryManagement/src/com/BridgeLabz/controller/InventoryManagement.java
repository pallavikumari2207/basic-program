package com.BridgeLabz.controller;

import java.util.Scanner;

import com.BridgeLabz.repository.Inventoryimpl;
import com.blz.service.InventoryInterface;

public class InventoryManagement {
	public static void main(String[] args) {
int num = 10;
		Scanner scan=new Scanner(System.in);
		Inventoryimpl inventry = new Inventoryimpl();
		
		while(num != 0)
		{
			System.out.println("Press 1 for write into file \n Press 2 for totalprice \n if you want to get total \n 4 to exit");
			int check = scan.nextInt();
			if(1 == check)
			{
				inventry.addinventory();
			}
			else if(2 == check)
			{   System.out.println("key:");
		        String key=scan.next();
				inventry.totalPrice(key);
			}
			if(3 == check)
			{
				inventry.inventoryTotal() ;
			}
			
			else if(4 == check)
			{
				return;
			}
			else
			{
				System.out.println("Wrong key pressed");
			}
			num++;
		}
	}
	}


