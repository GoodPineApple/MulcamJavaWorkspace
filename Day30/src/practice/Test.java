package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("����̹� �ε� �Ϸ�");
			String url = "jdbc:mysql://127.0.0.1:3306/java";
			String id = "root";
			String pw = "sds902";

			con = DriverManager.getConnection(url, id, pw);
			System.out.println("Ŀ�ؼ� ���� �Ϸ�");

			String sql = "insert into books(title, publisher, price, year) values('å', '���ǻ�', 10000, '2015')";

			stmt = con.createStatement();

			int result = stmt.executeUpdate(sql);

			System.out.println("SQL�������" + result);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Ŀ�ؼ� ���� ����");
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
