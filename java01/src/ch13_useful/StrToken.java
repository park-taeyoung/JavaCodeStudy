package ch13_useful;

public class StrToken {
	public static void main(String[] args) {
		String str = "apple/banana/grape/melon";
		String[] items = str.split("/");
		for(String s : items) {
			System.out.println(s);
		}
	}
}
