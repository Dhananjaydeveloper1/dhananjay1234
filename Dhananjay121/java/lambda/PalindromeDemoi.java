package com.FinalDemo;

interface palindrome {
	int palindrome (int num);
}

public class PalindromeDemoi {
public static void main(String[] args) {
	palindrome p1=(num)->{
		int rev=0;
		int temp=num;
		while(temp>0) {
			int result=temp%10;
			rev=rev%10+result;
			temp=temp/10;
		}
		return rev;
	};
	int rev1,num1=270;
	rev1=p1.palindrome(num1);
	if(rev1==num1) {
		System.out.println("number is palindrome"+num1);
	}
		else {
			System.out.println("number is not palindrome"+num1);
		}
	}


}

