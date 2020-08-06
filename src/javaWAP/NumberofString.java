package javaWAP;

public class NumberofString {
	public static void main(String[] args) {

		String s = "This is java Program";
		String[] w = s.split(" ");
		int count = 0;
		for (String q : w) {
			for (int i = 0; i <= q.length() - 1; i++) {
				count++;
			}
		}
		System.out.println("Total number of words in String =" + count);
	}
}
