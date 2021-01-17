import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.DeptDAO;
import com.dto.Cat;
import com.dto.Student;
import com.service.DeptService;

public class TestStudent {

	public static void main(String[] args) {

		//IoC 컨테이너
		
		//GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/*.xml");
	//stu1, 2 불러와서 같은지 비교, stu2번 두번 불러와서 같은지 비교
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("dao.xml");
		Student stu = ctx.getBean("firstStudent", Student.class);
		System.out.println(stu.getInfo());
		System.out.println(stu.getInfo2());
		
		/*
		 * Cat cat = ctx.getBean("pet01", Cat.class); System.out.println("cat"+cat);
		 */
		
		DeptService ser = ctx.getBean("deptservice", DeptService.class);
		List<String> list = ser.list();
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println("바로출력"+ser.list());
	}

}

