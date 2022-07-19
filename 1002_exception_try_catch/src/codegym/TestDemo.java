package codegym;

import java.sql.Connection;
import java.sql.SQLException;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		
		// This example cause NullPointerException because of that not implement connection
//		try {
//			conn.commit();
//		} catch(SQLException e) {
//			System.out.println("Catch SQLException");
//		} catch(Exception e1) { // Other exceptions
//			e1.printStackTrace();
//		} finally {
//			try {
//				conn.close(); // close connection to avoiding waste resource
//			} catch(SQLException e) {
//				e.printStackTrace();
//			}
//		}
		
		// Avoid NullPointerException example
		User user = new User();
//		user.getName().trim(); // here got exception error, because getName is NULL.
		
		// check if != null, then do something
//		if (user.getName() != null) {
//			
//		}
		
		// Java8: Optional 物件
		UserOptional userOptional = new UserOptional();
		
		// 如果物件拋回來是空的, 在orElse定義default字串
		System.out.println(userOptional.getName().orElse("No Name"));
		
		// 若在setter有給過值, 就會用給的
		userOptional.setName("Amy");
		System.out.println(userOptional.getName().orElse("No Name test"));
	}

}
