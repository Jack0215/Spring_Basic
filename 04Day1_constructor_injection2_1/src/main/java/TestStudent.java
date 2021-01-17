import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Person;


public class TestStudent {

	public static void main(String[] args) {

		//IoC 컨테이너
		
		//GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/*.xml");
	//stu1, 2 불러와서 같은지 비교, stu2번 두번 불러와서 같은지 비교
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:com/dto/Person.xml");
		Person stu = ctx.getBean("xxx",Person.class);
		System.out.println(stu);
		
		
		  Person stu1 = ctx.getBean("xxx1",Person.class); 
		  System.out.println(stu1);
		  
		  Person stu2 = ctx.getBean("xxx2",Person.class);
		  System.out.println(stu2.getInfo());
		  
		  Person stu3 = ctx.getBean("xxx3",Person.class); System.out.println(stu3);
		  System.out.println(stu3);  
		 
	}

}

