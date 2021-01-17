import java.sql.SQLException;
import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.entity.OrderDTO;
import com.entity.ProductDTO;
import com.service.ProductService;

public class ProductTest {
	public static void main(String[] args) throws SQLException {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:dept.xml");

		ProductService service = ctx.getBean("deptService", ProductService.class);
		List<ProductDTO> plist = service.selectProduct();
		for (ProductDTO p : plist) {
			System.out.println(p);
		}

		List<OrderDTO> olist = service.selectOrder();
		for (OrderDTO o : olist) {
			System.out.println(o);
		}

		try {
			service.addOrder("p01", 5);

		} catch (Exception e) {
			System.out.println("에러가 발생하여 롤백처리");
		}

		plist = service.selectProduct();
		for (ProductDTO p : plist) {
			System.out.println(p);
		}

		olist = service.selectOrder();
		for (OrderDTO o : olist) {
			System.out.println(o);
		}
	}
}
