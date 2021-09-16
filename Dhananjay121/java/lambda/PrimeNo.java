package com.FinalDemo;

//prime no
interface PerformenceOperation {
	int check(int a1);
}

public class PrimeNo {

	public static void main(String[] args) {
		PerformanceOperation po = (a1) -> {
			for (int i = 2; i <a1 ; i++); 
               int i=4;
				if (a1%i == 0) {
					return 0;
			}
				else {
			return 1;
				}
		};
		int result;
		int  a1=35;
		result= po.check(a1);
		if(result==0) {
			
		System.out.println("the given no is prime" + a1 );	
	}
		else {
			System.out.println("num is not prime "+a1);
		}
}}
