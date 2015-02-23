package com.conauto.test;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

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

//		Optional<String> reduced =
//			    stringCollection
//			        .stream()
//			        .sorted()
//			        .reduce((s1, s2) -> s1 + "#" + s2);
//
//			reduced.ifPresent(System.out::println);
		
//		int max = 1000000;
//		List<String> values = new ArrayList<>(max);
//		for (int i = 0; i < max; i++) {
//		    UUID uuid = UUID.randomUUID();
//		    values.add(uuid.toString());
//		
//
//		}
		
		
//		long t0 = System.nanoTime();
//
//		long count = values.stream().sorted().count();
//		System.out.println(count);
//
//		long t1 = System.nanoTime();
//
//		long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
//		System.out.println(String.format("sequential sort took: %d ms", millis));
		
		
		
//		long t0 = System.nanoTime();
//
//		long count = values.parallelStream().sorted().count();
//		System.out.println(count);
//
//		long t1 = System.nanoTime();
//
//		long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
//		System.out.println(String.format("parallel sort took: %d ms", millis));

		
		
//		
//		Map<Integer, String> map = new HashMap<>();
//
//		for (int i = 0; i < 10; i++) {
//		    map.putIfAbsent(i, "val" + i);
//		}
//
//		map.forEach((key, val) -> System.out.println(key+" - "+val));
//		
//		
//		map.computeIfPresent(3, (num, val) -> val + num);
//		map.get(3);             // val33
//
//		map.computeIfPresent(9, (num, val) -> null);
//		map.containsKey(9);     // false
//
//		map.computeIfAbsent(23, num -> "val" + num);
//		map.containsKey(23);    // true
//
//		map.computeIfAbsent(3, num -> "bam");
//		map.get(3);             // val33

		
		
		//DATE API
		
//		Clock clock = Clock.systemDefaultZone();
//		long millis = clock.millis();
//
//		System.out.println(millis);
//		Instant instant = clock.instant();
//		Date legacyDate = Date.from(instant);   // legacy java.util.Date
//
//		System.out.println(legacyDate);
//		
//		System.out.println(ZoneId.getAvailableZoneIds());
//		// prints all available timezone ids
//
//		ZoneId zone1 = ZoneId.of("Europe/Berlin");
//		ZoneId zone2 = ZoneId.of("Brazil/East");
//		System.out.println(zone1.getRules());
//		System.out.println(zone2.getRules());
//
//
//		LocalTime now1 = LocalTime.now(zone1);
//		LocalTime now2 = LocalTime.now(zone2);
//
//		System.out.println(now1.isBefore(now2));  // false
//
//		long hoursBetween = ChronoUnit.HOURS.between(now1, now2);
//		long minutesBetween = ChronoUnit.MINUTES.between(now1, now2);
//
//		System.out.println(hoursBetween);       // -3
//		System.out.println(minutesBetween);     // -239

		
//		LocalTime late = LocalTime.of(23, 59, 59);
//		System.out.println(late);       // 23:59:59
//
//		DateTimeFormatter germanFormatter =
//		    DateTimeFormatter
//		        .ofLocalizedTime(FormatStyle.SHORT)
//		        .withLocale(Locale.GERMAN);
//
//		LocalTime leetTime = LocalTime.parse("13:37", germanFormatter);
//		System.out.println(leetTime);   // 13:37
//
//		
//		
//		
//		LocalDate today = LocalDate.now();
//		LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
//		LocalDate yesterday = tomorrow.minusDays(2);
//
//		LocalDate independenceDay = LocalDate.of(2014, Month.JULY, 4);
//		DayOfWeek dayOfWeek = independenceDay.getDayOfWeek();
//		System.out.println(dayOfWeek);    // FRIDAY
		
		
//		DateTimeFormatter germanFormatter =
//			    DateTimeFormatter
//			        .ofLocalizedDate(FormatStyle.MEDIUM)
//			        .withLocale(Locale.GERMAN);
//
//			LocalDate xmas = LocalDate.parse("24.12.2014", germanFormatter);
//			System.out.println(xmas);   // 2014-12-24
//			
//			LocalDateTime sylvester = LocalDateTime.of(2014, Month.DECEMBER, 31, 23, 59, 59);
//
//			DayOfWeek dayOfWeek = sylvester.getDayOfWeek();
//			System.out.println(dayOfWeek);      // WEDNESDAY
//
//			Month month = sylvester.getMonth();
//			System.out.println(month);          // DECEMBER
//
//			long minuteOfDay = sylvester.getLong(ChronoField.MINUTE_OF_DAY);
//			System.out.println(minuteOfDay);    // 1439
//
//			
//			
//			Instant instant = sylvester
//			        .atZone(ZoneId.systemDefault())
//			        .toInstant();
//
//			Date legacyDate = Date.from(instant);
//			System.out.println(legacyDate);     // Wed Dec 31 23:59:59 CET 2014
//			
//			
//			DateTimeFormatter formatter =
//				    DateTimeFormatter
//				        .ofPattern("MMM dd, yyyy - HH:mm");
//
//				LocalDateTime parsed = LocalDateTime.parse("Nov 03, 2014 - 07:13", formatter);
//				String string = formatter.format(parsed);
//				System.out.println(string);     // Nov 03, 2014 - 07:13





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

	


