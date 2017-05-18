package sample10;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author jgs
 * 이름 :boardMyBatisDAOImpl
 * 길어서바꿀거야
 * id="boardMyBatis"
 */
//@Component("boardMyBatis")
@Repository
public class BoardMyBatisDAOImpl implements BoardDAO {

	
	
	public BoardMyBatisDAOImpl() {
		System.out.println("BoardMyBatisDAOImpl() 호출됨");
	}

	@Override
	public void select() {
System.out.println("BoardMyBatisDAOImpl() 의 select 호출됨");
		
	}

}
