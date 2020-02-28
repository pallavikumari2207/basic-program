package com.Bridgelabz.Runner;

import java.util.Scanner;

import com.Bridgelabz.service.implCliniqueManagement;
import com.Bridgelabz.service.intCliniqueManagement;

public class RunnerClinickManagemnet {

	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		 intCliniqueManagement cliniqueManagementSystemUtil= new implCliniqueManagement();
		while (true) {
			System.out.println(
					"\t\t\t\tPress 1. For Add Doctor Details\n\t\t\t\tPress 2. For Book Appointmnet\n\t\t\t\tPress 3. For show List of Doctors");
			int check = scan.nextInt();

			switch (check) {

			case 1:
				cliniqueManagementSystemUtil.addDoc();
				break;

			case 2:
				cliniqueManagementSystemUtil.getAppointment();
				break;

//			case 3:
//				cliniqueManagementSystemUtil.showDoctorList();
//				break;

			default:
				System.out.println("Entered Wrong number");

			}
			System.out.println("press 1 for another Appointment else press 2 for leave");
//			if (InputUtility.nextInt() == 1) {
//				continue;
//			} else {
//				break;
//			}
		}
	}

}
