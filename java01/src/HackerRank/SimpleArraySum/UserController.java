package HackerRank.SimpleArraySum;

import java.util.Scanner;

class Controller {
	Scanner sc = new Scanner(System.in);
	public int inputAge() {
		System.out.print("���� �Է��ض�: ");
		int age = sc.nextInt();
		try {
			checkAge(age);
		} catch (MyException e) {
			e.printStackTrace();
		}
		return age;
	}
	public void checkAge(int age) throws MyException {
		if(age<19) {
			throw new MyException("����Ұ�");
		} else {
			System.out.println("��");
		}
	}
}
public class UserController {
	public static void main(String[] args) {
		Controller ct = new Controller();
		ct.inputAge();  
	}
}


