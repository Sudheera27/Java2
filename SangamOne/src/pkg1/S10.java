package pkg1;

public class S10 {

	public static void main(String[] args) {
		String time1="";
		for(int j=0;j<12;j++) {
			for(int i=0;i<12;i++) {
				time1=String.valueOf(9+j)+":"+String.valueOf(i*5);
				System.out.println(time1);
			}
			System.out.println();
		}
	}
}
