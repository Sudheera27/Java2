package pkg1;

import java.util.Random;

public class S17 {
	public static void genPassword1(int size) {
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String digit = "0123456789";
		String all = upper+lower+digit;
		String pwd = "";
		int r1;
		Random rand1 = new Random();
		
		r1 = rand1.nextInt(25);
		pwd = pwd+upper.substring(r1,r1+1);
		
		r1 = rand1.nextInt(25);
		pwd = pwd+lower.substring(r1,r1+1);
		
		r1 = rand1.nextInt(9);
		pwd = pwd+digit.substring(r1,r1+1);
		
		for(int i=0; i<size-3; i++) {
			r1 = rand1.nextInt(61);
			pwd = pwd+all.substring(r1, r1+1);
		}
		System.out.println(pwd);
	}

	public static void main(String[] args) {
		genPassword1(8);
		genPassword1(12);
		genPassword1(30);
	}

}
