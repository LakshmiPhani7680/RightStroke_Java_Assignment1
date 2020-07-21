package com.rigthstroke.java;
import java.util.*;
public class PrimeNumber {
	public static boolean prime(int num) {
			for(int i=2;i*i<=num;i++) {
				if(num%i==0) {
					return false;
				}
			}
		return true;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number you want to check upto the given range");
		int range=scan.nextInt();
		for(int num=1;num<=range;num++) {
			int num1 = num;
			if(num1>1) {
				if(prime(num1)) 
				{
					System.out.println(num1+" is prime");
				}else {
					System.out.println(num1+" is not a Prime");
				}
				scan.close();
		}
			else {
				System.out.println("1 is neither prime nor composite");
		}
			}
	}
}
