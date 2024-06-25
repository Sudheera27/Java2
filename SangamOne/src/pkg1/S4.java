package pkg1;

public class S4 {
	public static void reverse1(String name) {
		int len1 = name.length();
		String reverse = "";
		for(int i = 0; i<len1; i++) {
			reverse = reverse + name.substring(len1-(i+1),len1-i);
		}
		System.out.println(reverse);
	}

	public static void main(String[] args) {
		reverse1("ABCDEFGH");
		reverse1("CHANDRASHEKAR");
		reverse1("KISHAN");
		reverse1("SUDHEERA");
	}

}
