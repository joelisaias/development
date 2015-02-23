package com.conauto.test;

import java.util.ArrayList;
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
	
//		
//		
//		final int num = 1;
//		Converter<Integer, String> stringConverter =
//		        (from) -> String.valueOf(from + num);
//
//		System.out.println(stringConverter.convert(2));     // 3
//		
//		
//		System.out.println("ACTUALIZADO");


//		Predicate<String> predicate = (s) -> s.length() > 0;
//
//		System.out.println(predicate.test("foo"));              // true
//		System.out.println(predicate.negate().test("foo"));     // false
//
//		Predicate<String> nonNull = Objects::nonNull;
//		
//		
//		System.out.println(nonNull.test("DFDGFDF"));
//		
//		
//		Predicate<String> isNull = Objects::isNull;
//		System.out.println(isNull.test(null));
//
//		
//		Predicate<String> isEmpty = String::isEmpty;
//		System.out.println(isEmpty.test(""));
//		Predicate<String> isNotEmpty = isEmpty.negate();
//		System.out.println(isNotEmpty.test("FFFFF"));
//		
		
		
//		Function<String, Integer> toInteger = Integer::valueOf;
//		
//		System.out.println(toInteger.apply("14"));
//		
//		Function<String, String> backToString = toInteger.andThen(String::valueOf);
//
//		System.out.println(backToString.apply("123"));     // "123"
//
//		
//		Supplier<Person> personSupplier = Person::new;
//		Person p=personSupplier.get();   // new Person
//		
		
//		Consumer<Person> greeter = (p) -> System.out.println("Hello, " + p.firstName);
//		greeter.accept(new Person("Luke", "Skywalker"));


//		Comparator<Person> comparator = (p1, p2) -> p1.firstName.compareTo(p2.firstName);
//
//		Person p1 = new Person("John", "Doe");
//		Person p2 = new Person("Alice", "Wonderland");
//
//		System.out.println(comparator.compare(p1, p2));             // > 0
//		System.out.println(comparator.reversed().compare(p1, p2));  // < 0


//		Optional<String> optional = Optional.of("ddddd");
//
//		System.out.println(optional.isPresent());           // true
//		System.out.println(optional.get());                 // "bam"
//		System.out.println(optional.orElse("fallback"));    // "bam"
//
//		optional.ifPresent((s) -> System.out.println(s.charAt(0)));     // "b"
		
		
		List<String> stringCollection = new ArrayList<>();
		stringCollection.add("ddd2");
		stringCollection.add("aaa2");
		stringCollection.add("bbb1");
		stringCollection.add("aaa1");
		stringCollection.add("bbb3");
		stringCollection.add("ccc");
		stringCollection.add("bbb2");
		stringCollection.add("ddd1");
		
//		stringCollection
//	    .stream()
//	    .filter((s) -> s.startsWith("a"))
//	    .forEach(System.out::println);
//
//		stringCollection
//	    .stream()
//	    .sorted()
//	    .filter((s) -> s.startsWith("a"))
//	    .forEach(System.out::println);
//
//		stringCollection
//	    .stream()
//	    .map(String::toUpperCase)
//	    .sorted((a, b) -> b.compareTo(a))
//	    .forEach(System.out::println);
//

//		boolean anyStartsWithA =
//			    stringCollection
//			        .stream()
//			        .anyMatch((s) -> s.startsWith("a"));
//
//			System.out.println(anyStartsWithA);      // true
//
//			boolean allStartsWithA =
//			    stringCollection
//			        .stream()
//			        .allMatch((s) -> s.startsWith("a"));
//
//			System.out.println(allStartsWithA);      // false
//
//			boolean noneStartsWithZ =
//			    stringCollection
//			        .stream()
//			        .noneMatch((s) -> s.startsWith("z"));
//
//			System.out.println(noneStartsWithZ);      // true

//		long startsWithB =
//			    stringCollection
//			        .stream()
//			        .filter((s) -> s.startsWith("b"))
//			        .count();
//
//			System.out.println(startsWithB);    // 3

		
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

	


