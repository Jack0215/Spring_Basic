import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:Person.xml");

		Student p = ctx.getBean("xxx", Student.class);
		try {
			System.out.println(p.sayEcho());
		} catch (Exception e) { 
			e.printStackTrace();
		}  
	}
}
