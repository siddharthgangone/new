package com.info.learning;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s = new Scanner(System.in);
		
		String number =s.next();
		
		int sum = 0;
		
		//ch[]ch=number.toCharArray();
		
		for (int i=0;i<number.length();i++ ) {
			
			int j=Integer.parseInt(String.valueOf(number.charAt(i)));
			sum = sum+ j*j*j;
			
			System.out.println(sum);
			
		}
		
		//System.out.println(sum);
		
		if(String.valueOf(sum).equals(number)) {
			
			System.out.println("Its an amstrong number");
			
		}
		
		
		
	}

}
