import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.TestDAO;
import com.dto.TestDTO;

public class TestMain {

	public static void main(String[] args) throws SQLException {
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:com/config/test.xml");
		TestDAO dao = ctx.getBean("TestDAO", TestDAO.class);
		List<TestDTO> list = dao.select();
		for (TestDTO t : list) { 
			System.out.println(t);
		}
		
		//dao.update("서울", "이재윤", 6);
		
		
		//dao.insert(7, "이재윤", "서울");
		dao.insert2(8, "이재윤", "서울");
		
	} 
}
 