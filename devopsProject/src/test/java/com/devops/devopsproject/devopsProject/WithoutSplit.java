package com.devops.devopsproject.devopsProject;


public class WithoutSplit {
	

	String s = "aaa,bb,g,s,ll";
	String[] temp = new String[10];
	String split ="";
	int length = s.length();
	int index =0;
	
	public void withOutSliptFunction() {
		for(int i =0;i<=length;i++) {
			if (s.charAt(i)!=',') {
				split = split+split.charAt(i);
			} else {
				i =i +1;
				temp[index] =split;
				index++;
			}
		}
		
		temp[index]=split;
		for (String s:temp) {
			System.out.println("Spliting value :"+s);
		}
		
	}
	
	public static void main(String[] args) {
		
		WithoutSplit objWithoutSplit = new WithoutSplit();
		
		objWithoutSplit.withOutSliptFunction();
	}

}
