package com.day1.session2.ex3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class AppleTester {

		
		public static void main(String[] args) {

		List<Apple> apples = Arrays.asList(new Apple("red", 400), new Apple(
				"green", 300), new Apple("green", 200), new Apple("red", 250));
		
		//Most imp functional interface in java 8
		
		//Predicate	
		Predicate<Apple> isGreen = (Apple a) -> a.getColor().equals("green");
		List<Apple> allGreenApples = AppleApp.filterApples(apples, isGreen);
		allGreenApples.forEach(a -> System.out.println(a.getWeight()));
		//Function
		apples.stream().map(b -> b.getColor()).forEach(b -> System.out.println(b));
		
		//Consumer
		
		//biConsumer
		Map<String, Integer>map=null;
		
		//Supplier
	
		//BiFunction
	
		
		
		
	}
}

















