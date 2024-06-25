package pkg1;

import java.util.Scanner;

public class S7 {
	public static void table1(int num1,int num2) {
		int start=num1;
		int end=num2;
		String str1="";
		for(int j=start;j<end+1;j++) {
			for(int i=1;i<11;i++) {
				str1=str1+j+"*"+i+"="+j*i+"\n";
			}
			str1=str1+"\n";
		}
		System.out.println(str1);
	}

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.print("Enter first number:");
		int num1 = sc1.nextInt();
		System.out.print("Enter second number:");
		int num2 = sc1.nextInt();
		table1(num1,num2);
	
		
	}

}
