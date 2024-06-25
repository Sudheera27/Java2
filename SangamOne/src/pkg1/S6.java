package pkg1;

public class S6 {

	public static void main(String[] args) {
		int start=40;
		int end=44;
		String str1="";
		for(int j=start;j<end+1;j++) {
			for(int i=1;i<11;i++) {
				str1=str1+j+"*"+i+"="+j*i+"\n";
			}
			str1=str1+"\n";
		}		
		System.out.println(str1);
		

	}

}
