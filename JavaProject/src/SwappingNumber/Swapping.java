package SwappingNumber;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=10;
//		int b=20;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		int num=a;
//		int t;
//		System.out.println("before swapping number==="+a+" " +b);
//		
//		t=a;
//		a=b;
//		b=t;
//		System.out.println(" after swapping number==="+a+"  "+b);
		
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println(a+"   "+b);
//		a=a*b;
//		b=a/b;
//		a=a/b;
		
//		a=a^b;
//		b=a^b; 
//		a=a^b;
//		b=a+b-(a=b);
		int rev=0;
		while(a!=0) {
			rev=rev*10+a%10;
			a=a/10;
		}
		if(num==rev) {
			System.out.println("plindrome number");
		}else {
			System.out.println("not plindrome number");
		}
		
		

	}

}
