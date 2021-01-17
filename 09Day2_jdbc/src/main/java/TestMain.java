import java.sql.SQLException;
import java.util.List;

public class TestMain {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		TestDAO dao = new TestDAO();
		List<TestDTO> list = dao.select();
		for (TestDTO t : list) {
			System.out.println(t);
		}
		
		//dao.insert(6, "이재윤", "서울");
		dao.delete(6);
	}
 
}
 