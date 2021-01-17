import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;import com.dto.Cat;
import com.dto.Student;
import java.util.Properties;


public class TestStudent {

	public static void main(String[] args) {

		//IoC 컨테이너
		
		//GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/*.xml");
	//stu1, 2 불러와서 같은지 비교, stu2번 두번 불러와서 같은지 비교
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml"); 
		
		Student stu = ctx.getBean("firstStudent", Student.class);
		 
		Map<String, Cat> map = stu.getMapCat();
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key+"="+map.get(key).getInfo()); 
		}
		Properties phones = stu.getPhones();
		Set<String> xxx = phones.stringPropertyNames();
		for (String key : xxx) {
			System.out.println(key+"="+phones.getProperty(key));
		}
	}  
	
	

}

 