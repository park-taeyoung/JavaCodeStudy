package kr.co.eland.ormdemo.repository;
 
import kr.co.eland.ormdemo.entity.Board;
 
import org.springframework.data.jpa.repository.JpaRepository;
 
                                                     //T, ID를 Board, Integer로 변경
public interface BoardRepository extends JpaRepository<Board, Integer> {
 
}