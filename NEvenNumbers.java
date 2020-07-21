package com.rightstroke.java;
import java.util.*;
public class RangeOfEvenNumbers {
	public static void main(String a[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Starting Number : ");
		int num_1=scan.nextInt();
		System.out.println("Enter Ending Number : ");
		int num_2=scan.nextInt();
		for(int i=(num_1)+1;i<num_2;i++) {
			if(i%2==0) {
				System.out.println(i+" is Even");
			}
		}
		scan.close();
	}
}
