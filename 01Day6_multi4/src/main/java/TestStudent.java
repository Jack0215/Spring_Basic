import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Student s = new Student ("홍길동",20);
	//	System.out.println(s);
		
		//IoC 컨테이너
		/*
		 * GenericXmlApplicationContext ctx = new
		 * GenericXmlApplicationContext("com/config/stu.xml"
		 * ,"classpath:com/config/person.xml");
		 */
		//GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/*.xml");
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/stu.xml");
	}
}

