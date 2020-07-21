package com.rightstroke.java;
import java.util.*;
public class PalindromeNumber {
	public static boolean palindrome(int num) {
		if (num>10) {
			String num1 = String.valueOf(num);
			char array[]=num1.toCharArray();
			int Length = array.length;
			char array1[]=new char[Length];
			int j=0;
			for (int i=(Length-1);i>=0;i--) {
				array1[j] = array[i];
				j++;
			}
			int count=0;
			for (int i = 0;i<Length;i++) {
				if (array[i]==array1[i]) {
					count++;
				}
			}
			if(count==Length) {
				return true;
			}else {
				return false;
			}
		}
		else {
			return true;
		}
	}
	public static void main(String a[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number you want to check : ");
		int num = scan.nextInt();
		if(palindrome(num)) {
			System.out.println("Given Number is Palindrome");
		}else {
			System.out.println("Given number is Not a Palindrome");
		}
		scan.close();
	}
}
