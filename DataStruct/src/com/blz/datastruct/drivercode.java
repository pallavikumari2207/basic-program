package com.blz.datastruct;

import java.util.Scanner;

public class drivercode {
	public static void main(String [] args)
	{
	Scanner scan=new Scanner(System.in);
	linkedlist  list=new  linkedlist ();
	boolean flag=true;
	while(flag){
		System.out.println(" ");
	System.out.println("1.add item to list at stART");
	System.out.println("2.ADDA AT LAST");
	System.out.println("3add at pos");
	System.out.println("4.delete at first");
	System.out.println("5.delete at last");
	System.out.println("6.delete at pos");
	System.out.println("7.view list");
	System.out.println("8.exit");
	System.out.println("9.search");
	System.out.println("enter choice(0-9)");
	int choice=scan.nextInt();
	int position;
	String val;
	String key;

	switch(choice)
	{
	case 1:System.out.println("enter value of list item");
	val=scan.next();
	list.insertAtStart(val);
	break;
	case 2:System.out.println("enter value of list item");
	val=scan.next();
	list.insertSAtLast(val);
	break;
	case 3:System.out.println("enter position");
	position=scan.nextInt();
	System.out.println("enter value of list item");
	val=scan.next();
	list.insertAtPos(val, position);
	break;
	case 4:list.deleteAtFirst();
	break;
	case 5:list.deletelast();
	break;
	case 6:System.out.println("enter pos");
	position=scan.nextInt();
	list.deleteAtpos(position);
	break;
	case 9:System.out.println("enter key");
	key=scan.next();
	if(list.search(key)==true) 
	{
		System.out.println("key found");
		}
	else
	{System.out.println("not found");}
	
	break;
	case 7:list.viewlist();break;
	case 8:flag=false;
	break;
	default:
	System.out.println("invalid choice");
	}
	}
	}
}
	


