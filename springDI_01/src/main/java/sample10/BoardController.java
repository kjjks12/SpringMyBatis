package sample10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

//@Component //id=boardController
@Controller
public class BoardController {
	
	@Autowired
	private BoardDTO boardDTO; //byType
	
	@Autowired
	private BoardDTO boardDTO2; //byType
	
	@Autowired
	private BoardService boardService;//byType
	
	
	public BoardController() {
		System.out.println("================================");
		System.out.println("BoardController() 호출됨:");
		System.out.println("boardDTO() :"+boardDTO);
		System.out.println("boardDTO2() :"+boardDTO2);
		
	}

	public void test(){
		System.out.println("================================");
		System.out.println("boardService() :"+boardService);
		System.out.println("boardDTO() :"+boardDTO);
		System.out.println("boardDTO2() :"+boardDTO2);
		boardService.select();
	}
	
}
