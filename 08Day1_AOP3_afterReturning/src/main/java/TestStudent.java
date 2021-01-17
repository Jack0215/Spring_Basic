import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:Person.xml");
		
		Student p = ctx.getBean("xxx", Student.class);
	
		System.out.println(p.sayEcho());
		System.out.println(p.callEcho());
		} 
	}  

 