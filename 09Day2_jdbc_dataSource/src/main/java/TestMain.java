import java.sql.SQLException;
import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.TestDAO;
import com.dto.TestDTO;

public class TestMain {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/test.xml");
		TestDAO dao = ctx.getBean("testDAO", TestDAO.class);
		List<TestDTO> list = dao.select();
		for (TestDTO t : list) {
			System.out.println(t);
		}	
		dao.insert(7, "이재윤", "서울");

		//dao.delete(6);
		//dao.update(6, "이지은", "서울");
	}
} 
 