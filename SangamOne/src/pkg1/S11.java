package pkg1;
import java.io.FileWriter;
import java.io.IOException;
public class S11 {

	public static void main(String[] args)throws IOException {
		FileWriter fw1=new FileWriter("SchoolClock.txt");
		double angle1=0.0;
		String time1="";
		String result="";
		for(int j=0;j<12;j++) {
			for(int i=0;i<12;i++) {
				time1=String.valueOf(9+j)+":"+String.valueOf(i*5);
				angle1=Math.abs((90-j*30)+(30*i)-(2.5*i));
				result+=time1+" - "+String.valueOf(angle1%360)+"\n";
			}
			result+="\n";
		}
		fw1.write(result);
		fw1.close();
		System.out.println(result);
	
	}

}
