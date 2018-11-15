package com.devops.devopsproject.devopsProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Demo{    
		 
	    @SuppressWarnings("resource")
		public static void main(String args[]) throws InterruptedException, IOException{
	 
	    	BufferedReader isr = new BufferedReader(new InputStreamReader(System.in));
	    	 
	        Scanner sc = new Scanner(System.in);
	 
	        System.out.println("B.R. - "+(char)isr.read());
	        System.out.println("Scanner - " + sc.nextLine());  
	                
	    }
	}

