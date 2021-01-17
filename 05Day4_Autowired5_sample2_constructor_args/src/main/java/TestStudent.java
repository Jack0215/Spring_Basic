import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;
import com.dto.Student;
import com.service.DeptService;

import java.util.Properties;


public class TestStudent {

	public static void main(String[] args) {

		//IoC 컨테이너
		
		//GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/*.xml");
	//stu1, 2 불러와서 같은지 비교, stu2번 두번 불러와서 같은지 비교
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml"); 
		DeptService stu = ctx.getBean("service", DeptService.class);
		System.out.println(stu);  
		List<String> list = stu.list();
		for (String string : list) {
			System.out.println(string);
		}
	}  
} 
  
 