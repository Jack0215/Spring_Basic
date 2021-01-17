import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Person;


public class TestStudent {

	public static void main(String[] args) {

		//IoC 컨테이너
		
		//GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/*.xml");
	//stu1, 2 불러와서 같은지 비교, stu2번 두번 불러와서 같은지 비교
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("person.xml");
		Person person1 = ctx.getBean("person1", Person.class);
		Person person2 = ctx.getBean("person2", Person.class);
		System.out.println(person1);
		System.out.println(person2); 
		
	}

}

