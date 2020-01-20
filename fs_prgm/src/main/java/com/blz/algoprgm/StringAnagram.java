package com.blz.algoprgm;

import java.util.Arrays;

public class StringAnagram {
	  static boolean areAnagram(char[] ch1, char[] ch2) 
	  {// boolean flag=false;
		int  n1=ch1.length;
		int n2=ch2.length;
		Arrays.sort(ch1);
		Arrays.sort(ch2); 
		for(int i=0;i<ch1.length;i++)
			if(ch1[i]!=ch2[i])
				return false;
	  
		return true;
	  }

	public static void main(String[] args) {
		String str1="hear";
		String str2="earth";
		 char[] ch1 = new char[str1.length()]; 
		 char[] ch2 = new char[str2.length()]; 
		  
	        // Copy character by character into array 
	        for (int i = 0; i < str1.length(); i++) { 
	            ch1[i] = str1.charAt(i); 
	            ch2[i] =str2.charAt(i);
	            
	        } 
	
	       if( areAnagram(ch1,ch2)==true)
	        System.out.println("string is anagram");
	       else 
	    	   System.out.println("string is not an anagram");
	        

	}

}
