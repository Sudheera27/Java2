package pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class S15 {

	public static void main(String[] args) throws FileNotFoundException {
		File f1= new File("olympics2_all/olympics2_2012.csv");
		Scanner sc1 = new Scanner(f1);
		String s1 = "";
		ArrayList<String> event1 = new ArrayList<String>();
		ArrayList<String> fname1 = new ArrayList<String>();
		ArrayList<String> lname1 = new ArrayList<String>();
		ArrayList<String> medal1 = new ArrayList<String>();
		ArrayList<String> country1 = new ArrayList<String>();
		ArrayList<String> rank1 = new ArrayList<String>();
		
		
		while(sc1.hasNext()){
			s1 = sc1.nextLine();
			String[]arr1 = s1.split(",");
			event1.add(arr1[2]);
			fname1.add(arr1[5]);
			lname1.add(arr1[4]);
			medal1.add(arr1[8]);
			country1.add(arr1[9]);
			
			
		}
		System.out.println("Events: "+event1);
		System.out.println("First Names: "+fname1);
		System.out.println("Last Names: "+lname1);
		System.out.println("Medals: "+medal1);
		//System.out.println("Country: "+country1);
		
		
		
		
		

	}

}
