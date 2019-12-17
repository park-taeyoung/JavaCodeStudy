package HackerRank.SimpleArraySum;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class ByteDAO {
	public void fileOpen() {
		try {
			FileInputStream fis = new FileInputStream("./Stream_test.csv"); // �ش� ��ġ�� ������ �д´�.
		} catch (FileNotFoundException e) {
			e.printStackTrace(); // ���� ���� �� ����ó�� �ϰ� �α� �״´�.
		}
	}
	
	public void fileSave() {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("./Stream_test.csv", true);
			fos.write(97); //a
			byte[] bArr = {98, 99, 100, 101, 102, 103}; //bcdefg
			fos.write(bArr); // abcdefg
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}


public class Stream_test {
	public static void main(String[] args) {
		ByteDAO b = new ByteDAO();
		b.fileOpen();
		b.fileSave();
	}
}
