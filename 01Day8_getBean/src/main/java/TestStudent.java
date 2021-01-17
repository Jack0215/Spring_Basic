import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {

		//IoC 컨테이너
		
		//GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/*.xml");
	//stu1, 2 불러와서 같은지 비교, stu2번 두번 불러와서 같은지 비교
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/*.xml");
		
		Student stu1 = ctx.getBean("aa", Student.class); //com.dto.Student를 불러온다.
		Student stu2 = ctx.getBean("bb", Student.class);
		
		System.out.println(stu1==stu2);
		Student stu3 = ctx.getBean("bb", Student.class);
		System.out.println(stu2==stu3);
		//현재는 초기값이 설정안되어있는데 값 설정은 xml에서 이뤄진다.
		//이런 과정을 의존주입, injection이라 한다. 나중에 값이 설정되어있는 xml을 불러와서 쓰면 된다.
		//만들어져있는 Bean을 getBean해서 사용하는것 : 의존주입
		
		
	}

}

