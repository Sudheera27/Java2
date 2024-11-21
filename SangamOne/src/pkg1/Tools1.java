package pkg1;

public class Tools1{
	public static void reverse(String s1) {

		int len1 = s1.length();
		String s2 = "";
		for(int i =0; i<len1; i++) {
			s2=s2 + s1.substring(len1-(i+1),len1-i);
		}
		System.out.println(s2);

	}
	
	public static void numbers(int n1) {
		for(int i=0;i<n1;i++) {
			System.out.print(i+", ");
			
		}
		System.out.println();
	}
	
	public static void e1(int n1) {
		for(int i =0; i<n1; i++) {
			System.out.print(i*2+", ");
			
		}
		System.out.println();
	}
	
	public static void o1(int n1) {
		for(int i=1;i<n1;i++) {
			System.out.print((i*2)-1+", ");
		}
		System.out.println();
	}
	
	public static void mult3(int n1) {
		for(int i=0; i<n1; i++) {
			System.out.print(i*3+", ");
		}
		System.out.println();
	}
	
	public static void mult4(int n1) {
		for(int i=0; i<n1; i++) {
			System.out.print(i*4+", ");
		}
		System.out.println();
	}
	
	public static void multn1n2(int n1,int n2) {
		for(int i=0; i<n1; i++) {
			System.out.print(i*n1+", ");
		}
		System.out.println();
		for(int i=0; i<n2; i++) {
			System.out.println(i*(n1+1));
		}
		
	}

	public void factorial1(int n1) {
		int n=n1;
		int factorial = 1;
		
		for (int i =1; i<=n; i++) {
			factorial = factorial * i;
		}
		
		System.out.println("Factorial of " + n + " is: " + factorial );

	}
}



