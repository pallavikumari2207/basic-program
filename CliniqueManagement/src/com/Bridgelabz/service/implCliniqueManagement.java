package com.Bridgelabz.service;

import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import com.Bridgelab.pathconfig.PathConfig;
import com.Bridgelabz.model.Doctor;
import com.Bridgelabz.model.Patient;
import com.bridgelabz.Repository.CliniqueRepositoryImpl;
import com.bridgelabz.Repository.CliniqueRepositoryint;
import com.google.gson.Gson;


public class implCliniqueManagement implements intCliniqueManagement{
	Scanner scan = new Scanner(System.in);
	private static CliniqueRepositoryint repo = new CliniqueRepositoryImpl();
	private static JSONObject obj = repo.readFromjson(PathConfig.PATHDOC);
	private static JSONObject obj1 = repo.readFromjson(PathConfig.PATHPATIENT);
	private static JSONObject obj2 = repo.readFromjson(PathConfig.PATHCLINIQUE);
	private static JSONArray arr3=new JSONArray();
	private static Gson gson = new Gson();
	private static JSONArray arr = (JSONArray) obj.get("doctor");
	private static JSONArray arr1 = (JSONArray) obj1.get("patient");
	 CliniqueRepositoryImpl imp=new CliniqueRepositoryImpl  ();
	@Override
	public void addDoc() {
  System.out.println("enter name of doctor");
  String doc_name=scan.next();
  System.out.println("enter id of doctor");
  String doc_id=scan.next();
  System.out.println("enter specilizaton of doctor");
  String doc_speclization=scan.next();
  System.out.println("enter avablity of doctor");
  String [] avail= {"am","pm","both"};
  for (int i = 0; i < avail.length; i++) {
	System.out.println((i+1)+"."+avail[i]);
}
  System.out.println("pick avablity of doctor:");
  int pick=scan.nextInt();
  String available = avail[pick];
  Doctor d=new Doctor(doc_name, doc_id, doc_speclization, available);
 String s=gson.toJson(d);
 arr.add(s);
  obj2.put(doc_id,arr3);
//  for (int j = 0; j < arr.size(); j++) {
//		 String c = arr.get(j).toString();
//		 Doctor detail= gson.fromJson(c,Doctor.class);  
//  JSONArray jc=(JSONArray) obj2.get(detail.getId());
//  jc.add(patient.getid());
//  }
  imp.writeToJson(obj2, PathConfig.PATHCLINIQUE);
 imp.writeToJson(obj,PathConfig.PATHDOC); 
  displayDoc();
	}

	@Override
	public void getAppointment() {
		
		System.out.println("parameter to book appointment with doctor\n 1:on basis of name\n 2: on basis of specilization\n 3:on basis of doc specialization\n");
		
		int ch=scan.nextInt();
		switch (ch) {
		case 1:System.out.println("entered choice is on basis of NAME\n");
		for (int j = 0; j < arr.size(); j++) {
			 String s = arr.get(j).toString();
			 Doctor detail= gson.fromJson(s,Doctor.class);
		  System.out.println("doctorName: "+detail.getName());
		}
		System.out.println("enter doc name");
		String name=scan.next();
		System.out.println("appointment time as am pm both");
		String time=scan.next();
		for (int j = 0; j < arr.size(); j++) {
			 String s = arr.get(j).toString();
			 Doctor detail= gson.fromJson(s,Doctor.class);
			 if(detail.getName() .equals(name))
				 if(detail.getAvail() .equals(time))
				 if(detail.getNumberofPatient()<=5)
				 {
					 System.out.println("enter name of patient");
					  String patient_name=scan.next();
					  System.out.println("enter id of patient");
					  String patient_id=scan.next(); 
					  System.out.println("enter mob of patient");
					  String patient_mob_numb=scan.next(); 
					  System.out.println("enter age of patient");
					  String patient_age=scan.next();
					  Patient p=new Patient(patient_name, patient_id,patient_mob_numb, patient_age);
					  String s1=gson.toJson(p);
					  arr1.add(s1);
					  imp.writeToJson(obj1,PathConfig.PATHPATIENT); 
					  displayPatient();
			 detail.setNumberofPatient(detail.getNumberofPatient()+1);
			 String val = gson.toJson(detail);
				arr.set(j, val);
				System.out.println("number of patient:"+detail.getNumberofPatient());
			  JSONArray jc=(JSONArray) obj2.get(detail.getId());
				
			  jc.add(patient_id);
			  imp.writeToJson(obj2, PathConfig.PATHCLINIQUE);
			  
			   
				}
			
		}
		break;
		case 2:System.out.println("entered choice is on basis of id\n");
		for (int j = 0; j < arr.size(); j++) {
			 String s = arr.get(j).toString();
			 Doctor detail= gson.fromJson(s,Doctor.class);
		  System.out.println("doctorName: "+detail.getId());
		}
		System.out.println("enter doc id");
		String id=scan.next();
		System.out.println("appointment time as am pm both");
		String Atime=scan.next();
		for (int j = 0; j < arr.size(); j++) {
			 String s = arr.get(j).toString();
			 Doctor detail= gson.fromJson(s,Doctor.class);
			 if(detail.getId() .equals(id))
				 if(detail.getAvail() .equals(Atime))
				 {
					 System.out.println("enter name of patient");
					  String patient_name=scan.next();
					  System.out.println("enter id of patient");
					  String patient_id=scan.next(); 
					  System.out.println("enter mob of patient");
					  String patient_mob_numb=scan.next(); 
					  System.out.println("enter age of patient");
					  String patient_age=scan.next();
					  Patient p=new Patient(patient_name,patient_id,patient_mob_numb, patient_age);
					  String s1=gson.toJson(p);
					  arr1.add(s1);
					  imp.writeToJson(obj1,PathConfig.PATHPATIENT); 
					  displayPatient();
		   }}
		break;
		
		
		}
		
		
		
	}

	  public void displayDoc(){
	  for (int j = 0; j < arr.size(); j++) {
		  
		 String s = arr.get(j).toString();
		 Doctor detail= gson.fromJson(s,Doctor.class);
	  System.out.println("doctorName: "+detail.getName());
	  System.out.println("doctor id:"+detail.getId());
	  System.out.println("specilization: "+detail.getSpecialization());
	  System.out.println("doctor avablity:"+detail.getAvail());
	  System.out.println();
	  
	  } }
	  public void displayPatient(){
		  for (int j = 0; j < arr1.size(); j++) {
			  
				 String s1 = arr1.get(j).toString();
				 Patient detail= gson.fromJson(s1,Patient.class);
			  System.out.println("patientName: "+detail.getName());
			  System.out.println("patient id:"+detail.getId());
			  System.out.println("mob "+detail.getMobile_number());
			  System.out.println("age:"+detail.getAge());
			  System.out.println();
		  }
	  }
}
