package test02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		// 1. ����̹� �ε�
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("����̹� �ε� �Ϸ�");
			
			String url = "jdbc:mysql://70.12.109.120:3306/java";
			String id = "root";
			String pw = "sds902";
			
			// 2. Ŀ�ؼ� ���� ����
			con = DriverManager.getConnection(url, id, pw);
			
			System.out.println("Ŀ�ؼ� ���� �׽�Ʈ �Ϸ�");
			
			// 3. SQL ��ɾ� �ۼ�
			String sql = "insert into books(title,publisher, price,year)" + 
			"values('�ǳ׿�', '�˼��մϴ�.', 5000, '2016')";
			
			// 4. Statement ��ü ����
			stmt = con.createStatement();
			
			// 5. ��ɾ� ���� -> 5.1 executeUpdate : insert, update, delete �ش�
			int result = stmt.executeUpdate(sql);
			
			// 6. 5���� �������� ��Ʈ��
			System.out.println("SQL ���� �Ϸ� ��� : " + result);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Ŀ�ؼ� ���� ����:SQLException�߻�");
			e.printStackTrace();
		} finally {
			// 7. 
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
