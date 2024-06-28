package pkg1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class S9 {
	public static String table1(int start,int end) {
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

	public static void main(String[] args)throws IOException {
		File f1=new File("in2.txt");
		FileWriter f2=new FileWriter("out2.txt");
		Scanner sc1=new Scanner(f1);
		String info1=sc1.nextLine();
		String[] arr1=info1.split(",");
		
		int start=Integer.parseInt(arr1[0]);
		int end=Integer.parseInt(arr1[1]);
		
		String result=table1(start,end);
		f2.write(result);
		f2.close();
	}

}
