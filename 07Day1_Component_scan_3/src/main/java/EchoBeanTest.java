
import org.springframework.context.support.GenericXmlApplicationContext;

import com.bean.Echobean;
import com.service.OneService;
import com.service.TwoService;

public class EchoBeanTest { 

	public static void main(String[] args) { 
		// TODO Auto-generated method stub 
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("Echo.xml");
		
		Echobean bean = ctx.getBean("aaa", Echobean.class);
		 
		OneService one = bean.getOne();
		TwoService two = bean.getTwo(); 
		  
		one.one();
		two.two();
	}	

}
