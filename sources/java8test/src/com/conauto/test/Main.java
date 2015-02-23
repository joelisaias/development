package com.conauto.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
//		System.out.println("hey world! actualizado");
//		
//		Formula formula=new Formula() {
//			
//			@Override
//			public double calculate(int a) {
//				return sqrt(a * 100);
//			}
//			
//		};
		
//
//		System.out.println(formula.calculate(100));     // 100.0
//		System.out.println(formula.sqrt(16));           // 4.0
		
//		
//		
//		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
//
//		System.out.println(names);
		
//		Collections.sort(names, new Comparator<String>() {
//		    @Override
//		    public int compare(String a, String b) {
//		        return b.compareTo(a);
//		    }
//		});
		
//		Collections.sort(names, (String a, String b) -> {
//		    return b.compareTo(a);
//		});
//
//		
//		Collections.sort(names, (String a, String b) -> b.compareTo(a));
//
//		
//		Collections.sort(names, (a, b) -> b.compareTo(a));
//
//		
//		System.out.println(names);
//		

		
//		
//		
//		Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
//		Integer converted = converter.convert("123");
//		System.out.println(converted);    // 123

		
		
//		Converter<String, Integer> converter = Integer::valueOf;
//		Integer converted = converter.convert("123");
//		System.out.println(converted);   // 123

		

//		Something something = new Something();
//		Converter<String, String> converter = something::startsWith;
//		String converted = converter.convert("Java");
//		System.out.println(converted);    // "J"
		
//		
//		PersonFactory<Person> personFactory = Person::new;
//		Person person = personFactory.create("Peter", "Parker");
//
//		
	
		
		
		final int num = 1;
		Converter<Integer, String> stringConverter =
		        (from) -> String.valueOf(from + num);

		System.out.println(stringConverter.convert(2));     // 3

		
	}
	
	
	}

class Something {
	String startsWith(String s) {
		return String.valueOf(s.charAt(0));
	}
}

class Person {
	String firstName;
	String lastName;

	Person() {
	}

	Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
}

interface PersonFactory<P extends Person> {
	P create(String firstName, String lastName);
}

class Lambda4 {
    static int outerStaticNum;
    int outerNum;

   void testScopes() {
        Converter<Integer, String> stringConverter1 = (from) -> {
            outerNum = 23;
            return String.valueOf(from);
        };

        Converter<Integer, String> stringConverter2 = (from) -> {
            outerStaticNum = 72;
            return String.valueOf(from);
        };
    }
}

	


