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
			System.out.println("����̹� �ε� �Ϸ�");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
		}
	}
	public void CreateConnection() {
		try {
			con = DriverManager.getConnection(URL);
			System.out.println("Ŀ�ؼ� ���� �Ϸ�");
		} catch (SQLException e) {
			System.out.println("");
			e.printStackTrace();
		}
	}
}
