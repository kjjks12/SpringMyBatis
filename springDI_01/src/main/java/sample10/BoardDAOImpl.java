package sample10;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//<bean class="boardDAOIMpl"/>
/**
 * 
 * @author jgs
 * 기본 id = "이클래스 이름의 첫 글자만 따용!"
 * boardDAOImpl; <-이렇게 잡힘
 */
//@Component
@Repository
public class BoardDAOImpl implements BoardDAO {

	public BoardDAOImpl() {
		System.out.println("BoardDAOImpl()이 생성되었습니다.");
	}

	@Override
	public void select() {
		System.out.println("BoardDAOImpl()의 select 호출되었습니다.");
	}

}
