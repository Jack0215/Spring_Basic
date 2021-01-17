
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;

import java.util.Properties;


public class TestStudent {

	public static void main(String[] args) {

		//IoC 컨테이너
		 
		//GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/*.xml");
	//stu1, 2 불러와서 같은지 비교, stu2번 두번 불러와서 같은지 비교
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml"); 
		
		
		Student st = ctx.getBean("stu", Student.class);
		System.out.println(st);  
	
	}    
} 
  
 