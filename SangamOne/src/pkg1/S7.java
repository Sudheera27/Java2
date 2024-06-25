package pkg1;

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
		table1(500,502);
		table1(2000,2005);
	
		
	}

}
