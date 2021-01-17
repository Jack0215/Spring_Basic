import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;


public class TestStudent {

	public static void main(String[] args) {

		//IoC 컨테이너
		
		//GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/*.xml");
	//stu1, 2 불러와서 같은지 비교, stu2번 두번 불러와서 같은지 비교
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/stu.xml");
		//scope=prototype
		Student stu1 = ctx.getBean("stu1", Student.class); //new
		Student stu2 = ctx.getBean("stu1", Student.class); //new 
		System.out.println(stu1==stu2); //윗 두줄은 getBeang하면 객체가 각각 새롭게 만들어짐
		
		Student stu3 = ctx.getBean("stu2", Student.class); 
		Student stu4 = ctx.getBean("stu2", Student.class);
		System.out.println(stu3==stu4); //스코프를 싱글톤으로했기 때문에 하나의 객체를 썼기 때문에 ture가 나옴
		
		Student stu5 = ctx.getBean("scopeTest", Student.class);
		Student stu6 = ctx.getBean("scopeTest", Student.class);
		System.out.println(stu5==stu6); //true가 나온다는것은 기본이 싱글톤, false는 기본이 프로토타입이라는 뜻
	}

}

