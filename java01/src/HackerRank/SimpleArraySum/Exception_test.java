package HackerRank.SimpleArraySum;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception_test {
	public static void main(String[] args) {
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("./test.csv"));
			String s;
			while((s = br.readLine())!=null) {
				System.out.println(s);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null)
					br.close();
			} catch (IOException e) {
			}
		}
	}
}
