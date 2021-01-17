import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Cat;
import com.spring.Person;


public class TestStudent {

	public static void main(String[] args) {

		//IoC 컨테이너
		
		//GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/*.xml");
	//stu1, 2 불러와서 같은지 비교, stu2번 두번 불러와서 같은지 비교
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("echo1.xml","echo2.xml");

		Person per = ctx.getBean("onePerson",Person.class);
		System.out.println(per); 
		
		
	}
}

