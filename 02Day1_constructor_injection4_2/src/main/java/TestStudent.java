import java.util.List;
import java.util.Properties;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.dao.support.DaoSupport;

import com.dao.DeptDAO;
import com.dto.Cat;
import com.dto.Student;
import com.service.DeptService;

public class TestStudent {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("dao.xml");
		
		DeptService service = ctx.getBean("prope", DeptService.class);
		System.out.println(service);
		
		List<String> list = service.list(); 
		for (String string : list) {
			System.out.println(string);
		} 
	}
}

