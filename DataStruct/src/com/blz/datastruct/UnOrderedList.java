package com.blz.datastruct;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UnOrderedList {
	public static void main(String[] args) {
		/*
		 * try and catch block for checking for file related exceptions
		 */
		try {
			// creating a new file
			File f1 = new File("/home/admin1/eclipse-workspace/DataStruct/DSFile/xyz");
			linkedlist list = new linkedlist();
			//@SuppressWarnings("resource")
			Scanner sf = new Scanner(f1);
			Scanner s = new Scanner(System.in);
			// addind values from file to list
			while (sf.hasNext()) {
				list.insertAtStart(sf.next());
			}
			// printing list
			System.out.println("gh"+list);
			/*
			 * writing to file using file writer
			 */
			/*FileWriter fw = new FileWriter(f1);
			System.out.println("enter a word ");
			String s1 = s.nextLine();
			System.out.println(list.getsize());
			// checking if word is found and deleting it and then saving list to file
			if (list.search(s1)) {
				list.remove(s1);
				int n = 0;
				while (n < list.getsize()) {
					fw.write(list.pop(0) + " ");
					fw.flush();
					/* n++; */
				//}
				//System.out.println("found and deleted");
				// or adding it to list and saving it to file
			//} else {
				//list.insertAtStart(s1);
				//int n = 0;
				//while (n < list.getsize()) {
					//fw.write(list.pop(0) + " ");
					//fw.flush();
					/* n++; */
				//}
//				System.out.println("added and saved");
				//fw.close();
				//s.close();
			//}

		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		} catch (IOException e) {
			System.out.println("io except");
		}
	
}}