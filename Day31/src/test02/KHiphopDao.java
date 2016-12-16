package test02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KHiphopDao {
	private final String URL = "jdbc:mysql://70.12.109.120:3306/java";
	private final String DB_ID = "root";
	private final String DB_PW = "sds902";
	
	private Connection con;
	
	public KHiphopDao() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 로딩 완료");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 에러");
			e.printStackTrace();
		}
	}
	public void CreateConnection() {
		try {
			con = DriverManager.getConnection(URL);
			System.out.println("커넥션 생성 완료");
		} catch (SQLException e) {
			System.out.println("");
			e.printStackTrace();
		}
	}
}
