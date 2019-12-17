package HackerRank.SimpleArraySum;

import java.util.Scanner;

class Controller {
	Scanner sc = new Scanner(System.in);
	public int inputAge() {
		System.out.print("나이 입력해라: ");
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
			throw new MyException("입장불가");
		} else {
			System.out.println("즐감");
		}
	}
}
public class UserController {
	public static void main(String[] args) {
		Controller ct = new Controller();
		ct.inputAge();  
	}
}


