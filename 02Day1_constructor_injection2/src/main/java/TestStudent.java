import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {

		//IoC 컨테이너
		
		//GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/*.xml");
	//stu1, 2 불러와서 같은지 비교, stu2번 두번 불러와서 같은지 비교
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:stu.xml");
		Student stu = ctx.getBean("firstStudent", Student.class);
		System.out.println(stu);
		
		Student stu2 = ctx.getBean("secondStudent", Student.class);
		System.out.println(stu2);
		
		Student stu3 = ctx.getBean("thirdStudent", Student.class);
		System.out.println(stu3); 
	}

}

