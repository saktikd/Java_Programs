package type3_others;

import java.util.Scanner;

public class Find_Max_Between_Two_Number {

	public static void main(String[] args) {
		
		int a,b;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number :");
		a=sc.nextInt();
		System.out.println("Enter Second Number :");
		b=sc.nextInt();
		if(a>b)
		System.out.println("Max Number="+a);
		else
		System.out.println("Max Number="+b);
		
		
		
		
		
		
	}

}
