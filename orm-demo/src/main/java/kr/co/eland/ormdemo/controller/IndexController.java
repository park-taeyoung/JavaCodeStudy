package kr.co.eland.ormdemo.controller;
 
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
 
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
 
import kr.co.eland.ormdemo.dto.BoardDto;
import kr.co.eland.ormdemo.dto.BoardDto.Response;
import kr.co.eland.ormdemo.entity.Board;
import kr.co.eland.ormdemo.repository.BoardRepository;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
 
@Controller
public class IndexController {
     
    @Autowired
    private BoardRepository boardRepository;
     
    @RequestMapping(value="/index", method=RequestMethod.GET)
    public String index(ModelMap modelMap){
        modelMap.put("time", new Date());
        modelMap.put("message", "hello~~");
         
        return "index";
    }
     
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String main(ModelMap modelMap){
        List<Board> boards = boardRepository.findAll();
         
        if(boards.size() != 0){
            List<BoardDto.Response> responseList = new ArrayList<BoardDto.Response>();
            for (Board board : boards) {
                BoardDto.Response response = new Response();
                response.setId(board.getId());
                response.setWriter(board.getWriter());
                response.setTitle(board.getTitle());
                response.setContent(board.getContent());
                responseList.add(response);
            }
             
            modelMap.put("responseList", responseList);
            return "home";
        } else {
            return null;   
        }
    }
     
    @RequestMapping(value = "/create-form", method = RequestMethod.GET)
    public String getStudyForm(Model model) {
 
        return "create";
    }
 
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveBoard(@RequestBody @Valid BoardDto.Request request) {
         
        Board board = new Board();
        board.setWriter(request.getWriter());
        board.setTitle(request.getTitle());
        board.setContent(request.getContent());
         
        Board savedBoard = boardRepository.save(board);
         
        return "home";
    }
     
}