package com.day1.session1.ex0;

import java.util.stream.LongStream;

//class to find if prime number
class Prime{
	
	//method to find if prime number
	public static boolean isPrime(Long n){
		boolean isPrimeNumber=true;
		for(int i=2;i<n;i++){
			if(n%i==0)
				isPrimeNumber=false;
		}
		return isPrimeNumber;
	}
}

//tester class
public class MotivationJava8 {
	
	//tester method
	public static void main(String[] args) {
		
		//split into parallel streams for processing
		long prime = LongStream.rangeClosed(1, 100_00)
					.parallel()
					.filter((n) -> Prime.isPrime(n))
					.count();
		System.out.println(prime);
		
		
		/*
		 * System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "8");
		or

		java -Djava.util.concurrent.ForkJoinPool.common.parallelism=8 DemoTakingAdvOfParallelProcessingwithOutPhd

		 */
	}

}
