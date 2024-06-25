package pkg1;

public class S3 {

	public static void main(String[] args) {
		String str1 = "ABCDEF";
		String str2 = "";
		System.out.println(str1);
		
		for(int i = 0;i<6;i++) {
			str2 = str1.substring(6-(i+1),6-i);
			System.out.print(str2);
		}
		
		

	}

}
