package com.conauto.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		System.out.println("hey world! actualizado");
		
		Formula formula=new Formula() {
			
			@Override
			public double calculate(int a) {
				return sqrt(a * 100);
			}
			
		};
		
//
//		System.out.println(formula.calculate(100));     // 100.0
//		System.out.println(formula.sqrt(16));           // 4.0
		
		
		
		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

		System.out.println(names);
		
//		Collections.sort(names, new Comparator<String>() {
//		    @Override
//		    public int compare(String a, String b) {
//		        return b.compareTo(a);
//		    }
//		});
		
		Collections.sort(names, (a, b) -> b.compareTo(a));

		
		System.out.println(names);
		

		
	}
	

}
