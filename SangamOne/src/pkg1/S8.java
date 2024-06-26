package pkg1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class S8 {
	public static String table2(int start,int end) {
		String str1="";
		for(int j=start;j<end+1;j++) {
			for(int i=1;i<11;i++) {
				str1=str1+j+"*"+i+"="+j*i+"\n";	
			}
			str1=str1+"\n";
		}
		System.out.println(str1);
		return str1;
	}

	public static void main(String[] args) throws IOException {
		File f1=new File("in1.txt");
		FileWriter fw1=new FileWriter("out1.txt");
		Scanner sc1=new Scanner(f1);
		int start=sc1.nextInt();
		int end=sc1.nextInt();
		String result=table2(start,end);
		fw1.write(result);
		fw1.close();
		
		
		
	}

}
