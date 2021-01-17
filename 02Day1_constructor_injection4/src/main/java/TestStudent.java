import java.util.List;
import java.util.Properties;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.DeptDAO;
import com.dto.Cat;
import com.dto.Student;
import com.service.DeptService;

public class TestStudent {

	public static void main(String[] args) {

		//IoC 컨테이너
		 
		//GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/*.xml");
	//stu1, 2 불러와서 같은지 비교, stu2번 두번 불러와서 같은지 비교
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("dao.xml");
		
		DeptService service = ctx.getBean("prope",DeptService.class);
		System.out.println(service);
		List<String> list = service.list(); 
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println("바로출력"+service.list());
	}

}

