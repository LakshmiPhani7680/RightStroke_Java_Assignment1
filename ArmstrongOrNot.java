package com.rightstroke.java;
import java.util.*;
public class ArmstrongOrNot {
	public static boolean armstrong(int num) {
		int temp=num;
		int sum=0;
		while(num>0) {
			sum+=((num%10)*(num%10)*(num%10));
			num=(int)num/10;
		}
		if(temp==sum) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String a[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number you want to check : ");
		int num = scan.nextInt();
		if(armstrong(num)) {
			System.out.println("The given num is Armstrong");
		}else {
			System.out.println("The given number is Not an Armstrong");
		}
		scan.close();
	}
}
