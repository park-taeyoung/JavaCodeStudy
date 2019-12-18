package ch12_inner;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
// F3 : 소스 코드 보기
// F4 : 계층 구조 보기


// super.멤버 : 부모클래스의 멤버 호출
// super() : 부모클래스의 생성자 호출
// this.멤버 : 내 클래스의 멤버 호출
// this() : 내 클래스의 생성자 호출
// 생성자 : 클래스 이름과 같은 method
//       리턴 타입이 없음
//       객체가 생성될 때 자동 호출된다.

public class InnerExam extends Frame{
	public InnerExam() {
		super("내부 클래스 테스트");
		// 프레임의 가로, 세로 사이즈 설정
		setSize(300, 400);
		// 프레임을 화면에 표시
		setVisible(true);
	}
	
	public static void main(String[] args) {
		InnerExam e = new InnerExam();
		
//		이벤트(Event) : 시스템과 사용자의 상호 작용
//		이벤트소스.이벤트리스터(이벤트핸들러)
//		이벤드소스 : 이벤트의 대상
//		이벤트리스너 : 이벤트가 일어났는지 감시하는 기능
//		이벤트핸들러 : 이벤트가 발생했을 때 실행되는 코드
		
		e.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0); //프로그램 강제 종료
			}
		});
	}
}



//	class A {
//		class B {
//		}
//	}
//	
//	class A {
//		public void print() {
//			class B {
//			}
//		}
//	}
//	
//	e.addWindowListener(   )

