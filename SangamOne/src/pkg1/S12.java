package pkg1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class S12 {
	public static String convert1(String fname)throws IOException {
		File f1=new File(fname);
		FileWriter fw1=new FileWriter("convert_out.txt");
		Scanner sc1=new Scanner(f1);
		String input1="";
		String output1="";
		
		double lhs_value,rhs_value;
		String lhs_units,rhs_units;
		while(sc1.hasNext()){
			String str1="";
			String str2="";
			input1=sc1.nextLine();
			String[]arr1=input1.split(" ");
			lhs_value=Double.parseDouble(arr1[0]);
			lhs_units=arr1[1];
			rhs_value=Double.parseDouble(arr1[3]);
			rhs_units=arr1[4];
			str1="1 "+lhs_units+" = "+(rhs_value/lhs_value)+" "+rhs_units;
			str2="1 "+rhs_units+" = "+(lhs_value/rhs_value)+" "+lhs_units;
			output1+=str1+"\n"+str2+"\n"+"\n";
			System.out.println(output1);
			
			
		}
		sc1.close();
		fw1.write(output1);
		fw1.close();
		return output1;
	}

	public static void main(String[] args)throws IOException{
		String result=convert1("convert.txt");
		System.out.println(result);
		
		
		

	}

}
