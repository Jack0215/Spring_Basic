import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Person;

public class TestStudent {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:person.xml");
		
		Person p = ctx.getBean("xxx", Person.class);
		p.getInfo();
		} 
	} 

  