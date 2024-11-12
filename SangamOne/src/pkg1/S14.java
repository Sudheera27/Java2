package pkg1;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
public class S14 {

	public static void main(String[] args) throws IOException{
		
		File f1= new File("olympics.csv");
		Scanner sc1 = new Scanner(f1);
		ArrayList<String>year1=new ArrayList<>();
		ArrayList<String>city1=new ArrayList<>();
		String s1 = "";
		s1 = sc1.nextLine();
		for(int i=0;i<25;i++) {
			s1 = sc1.nextLine();
			String[]temp=s1.split(",");
			year1.add(temp[0]);
			city1.add(temp[1]);	
		}
		int len1=year1.size();
		System.out.println(len1);
		System.out.println(year1);
		System.out.println(city1);

	}

}
