package com.rightstroke.java;
import java.util.*;
public class AreaOfARectangle {
	public static double rectangle(double l,double b) {
		double area=l*b;
		return area;
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Length of the Rectangle : ");
		double Length=scan.nextDouble();
		System.out.println("Enter Breadth of the Rectangle : ");
		double Breadth=scan.nextDouble();
		System.out.println("The Area of Rectangle is : "+rectangle(Length,Breadth));
		scan.close();
	}

}
