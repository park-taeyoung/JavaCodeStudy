////package com.example.demo;
////
////import org.springframework.boot.SpringApplication;
////import org.springframework.boot.autoconfigure.SpringBootApplication;
////
////@SpringBootApplication
////public class OrmDemoApplication {
////
////	public static void main(String[] args) {
////		SpringApplication.run(OrmDemoApplication.class, args);
////	}
////
////}
////
//
//// ---------------------------------------------------------


//package kr.co.eland.ormdemo;
//// package kr.co.eland.ormdemo;
//
//import java.util.ArrayList;
//import java.util.List;
// 
//import kr.co.eland.ormdemo.entity.Board;
//import kr.co.eland.ormdemo.repository.BoardRepository;
// 
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
// 
//@SpringBootApplication          //CommandLineRunner라는 인터페이스를 구현하여 main메소드에서가 아닌 run메소드에 실행시 구동할 코드를 작성한다.
//public class OrmDemoApplication implements CommandLineRunner {
// 
//    @Autowired
//    BoardRepository boardRepository;
//     
//    public static void main(String[] args) {
//        SpringApplication.run(OrmDemoApplication.class, args);
//    }
// 
//    @Override
//    public void run(String... args) throws Exception {
//        // 객체 생성
//        // id는 자동생성으로 설정했기 때문에 setId하지 않아도 됨
//        Board board1 = new Board();
//        board1.setTitle("title01");
//        board1.setContent("This is content01");
//        board1.setWriter("writer01");
// 
//        Board board2 = new Board();
//        board2.setTitle("title02");
//        board2.setContent("This is content02");
//        board2.setWriter("writer02");
// 
//        Board board3 = new Board();
//        board3.setTitle("title03");
//        board3.setContent("This is content03");
//        board3.setWriter("writer03");
// 
//        Board board4 = new Board();
//        board4.setTitle("title04");
//        board4.setContent("This is content04");
//        board4.setWriter("writer04");
// 
//        // 한번에 여러개 저장하기 위해서 list형태로 객체 저장
//        // board3, board4를 리스트에 저장
//        List<Board> boards = new ArrayList<>();
//        boards.add(board3);
//        boards.add(board4);
// 
//        System.out.println("[1] insert 실행");
// 
//        // 단건 저장
//        boardRepository.save(board1);
//        boardRepository.save(board2);
// 
//        // 다건 한번에 저장
//        boardRepository.saveAll(boards);
// 
//        System.out.println("[1] insert 실행 완료!");
// 
//        System.out.println("[2] SELECT * FROM BOARD 실행");
//        // 저장한 데이터 모두 가져오기
//        List<Board> resultBoards = boardRepository.findAll();
//        System.out.println("[2] SELECT * FROM BOARD 실행 결과");
//        for (int i = 0; i < resultBoards.size(); i++) {
//            System.out.println("ID : " + resultBoards.get(i).getId());
//            System.out.println("글쓴이 : " + resultBoards.get(i).getWriter());
//            System.out.println("제목 : " + resultBoards.get(i).getTitle());
//            System.out.println("내용 : " + resultBoards.get(i).getContent() + "\n");
//        }
//        
//        
////        System.out.println("[과제] SELECT * FROM BOARD WHERE id = '2' 실행");
////        //이부분을 채워주세요 !!!!
////        findByFirstnameEquals 
////        System.out.println("[과제] SELECT * FROM BOARD WHERE id = '2' 결과");
////        System.out.println("ID : " + resultBoard.getId());
////        System.out.println("글쓴이 : " + resultBoard.getWriter());
////        System.out.println("제목 : " + resultBoard.getTitle());
////        System.out.println("내용 : " + resultBoard.getContent() + "\n");
//
//        
// 
//    }
//}
// ---------------------------------------------------------


package kr.co.eland.ormdemo;
 
import java.util.Optional;
 
import kr.co.eland.ormdemo.entity.Board;
import kr.co.eland.ormdemo.entity.Comment;
import kr.co.eland.ormdemo.repository.BoardRepository;
import kr.co.eland.ormdemo.repository.CommentRepository;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
@SpringBootApplication
public class OrmDemoApplication /* implements CommandLineRunner */
{
 
    @Autowired
    BoardRepository boardRepository;
    @Autowired
    CommentRepository commentRepository;
 
    public static void main(String[] args) {
        SpringApplication.run(OrmDemoApplication.class, args);
    }
 
//    @Override
//    public void run(String... args) throws Exception {
// 
//        System.out.println("[과제] SELECT * FROM BOARD WHERE id = '2' 실행");
//        Optional<Board> resultBoard = boardRepository.findById(2);
//        System.out.println("[과제] SELECT * FROM BOARD WHERE id = '2' 결과");
//        System.out.println("ID : " + resultBoard.get().getId());
//        System.out.println("글쓴이 : " + resultBoard.get().getWriter());
//        System.out.println("제목 : " + resultBoard.get().getTitle());
//        System.out.println("내용 : " + resultBoard.get().getContent() + "\n");
// 
//        //Comment 객체 생성
//        //게시물 id 2(resultBoard)에 댓글을 다는 것과 같은 동작
//        Comment comment1 = new Comment();
//        comment1.setBoard(resultBoard.get());
//        comment1.setWriter("writer02");
//        comment1.setContent("This is content02's Comment");
//         
//        commentRepository.save(comment1);
//    }
 
}
