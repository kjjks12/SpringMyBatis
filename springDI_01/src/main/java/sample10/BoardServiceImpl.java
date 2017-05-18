package sample10;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class BoardServiceImpl implements BoardService {

	//autowire 로 주입해야해!!!
	@Resource(name="boardDAOImpl")
	private BoardDAO boardDao;
	
	//@Resource(name="boardDAOImpl")
	@Autowired
	private BoardDAO boardMyBatisDAOImpl;
	
	
	

	public BoardServiceImpl() {
		System.out.println("BoardServiceImpl()호출됨");
	}




	@Override
	public void select() {
		System.out.println("===========================================");
		System.out.println("BoardMyBatisDAOImpl :"+boardMyBatisDAOImpl );
		System.out.println("boardMyBatis :"+boardDao );
		boardMyBatisDAOImpl.select();
		boardDao.select();
		
	}

}
