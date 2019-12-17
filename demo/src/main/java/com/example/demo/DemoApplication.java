package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.eland.repository.UserRepository;

@SpringBootApplication
public class DemoApplication {
	// UserRepository userRepository = new UserRepository(); 이걸 쓸땐 객체화 해야 한다.
	// 문제가 생기는 이유는 이 i/f 객체화 되지 않아서 null로 인식되서 발생한 문제다.
	// private static UserRepository userRepository;
	
	// 이게 i/f를 객체화 해주는 작업이다.
	@Autowired
	private static UserRepository userRepository;
	 
	public static void main(String[] args) {
		
//		//  1, 2는 단건 삽입을 위한 객체. 얘는 오브젝트다.
//		User user1 = new User();
//		user1.setId(1);
//		user1.setName("test01");
//
//		User user2 = new User();
//		user2.setId(2);
//		user2.setName("test02");
//		
//		// 3, 4는 다건 삽입을 위한 객체. 리스트 형태로 여러개를 동시에 넣을 수 있는 오브젝트다.
//		User user3 = new User();
//		user3.setId(3);
//		user3.setName("test03");
//
//		User user4 = new User();
//		user4.setId(4);
//		user4.setName("test04");
//
//		List<User> users = new ArrayList<>();
//		// 자바 8의 경우 new하고 뭘 쓸껀지는 List<user> 타입에 리스트를 만들꺼다 하는거니깐
//		// 7에선 타입지정해줘야 하는데 8에선 타입 지정해주지 않아도 선언한 타입으로 알아서 된다.
//		
//		users.add(user3);
//		users.add(user4);
//
//		// 단건
//		userRepository.save(user1); // insert
//		userRepository.save(user1); // insert
//		
//		// 다건
//		userRepository.saveAll(users); // insert
		
		SpringApplication.run(DemoApplication.class, args);
	}
}
