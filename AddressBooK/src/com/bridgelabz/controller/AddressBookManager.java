package com.bridgelabz.controller;

import java.util.Scanner;

import com.bridgeLabz.repository.implementngAddressBook;

public class AddressBookManager {
	public static void main(String[] args)
	{    implementngAddressBook util=new  implementngAddressBook();
        Scanner scan=new Scanner(System.in);
       // implementngAddressBook.read(person);
		boolean isExitAddressBook = false;
		System.out.println("Address book manager\n");
		while (!isExitAddressBook) {

			System.out.println("Select menu");
			System.out.println("1. New Address Book\n2. Open Address Book\n" + "3. Save Address Book\n"
					+ "4. SaveAs Address Book\n" + "5. Quit");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				// new address book
				util.createNewAddressBook();

				break;
			case 2:
				// open
				// opening address book
				/* util.openAddressBook(); */

				break;
			/*
			 * case 3: // save util.save(); break;
			 */
			/*
			 * case 4: // saveAs util.saveAs(); break;
			 */
			case 5:
				// quit
				System.out.println("-----------------------Quit Address Book-----------------------");
				isExitAddressBook = true;
				System.out.println("Thank you for your time");

				break;
			default:
				System.out.println("Invalid option");
				break;

			}
		}

		scan.close();
	}

}
