package test06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PpstmtUpdate {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ppstmt = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("����̹� �ε� �Ϸ�.");
			
			String url = "jdbc:mysql://70.12.109.120:3306/java";
			String id = "root";
			String pw = "sds902";
			
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("Ŀ�ؼ� ���� �Ϸ�");
			
			Scanner scan = new Scanner(System.in);
			System.out.println("���ϴ� ������ �ι�°����");
			String s = scan.next();
			
			String sql = "update KHipHop set listenerpop=0 where singer like '_?'";
			ppstmt = con.prepareStatement(sql);
			ppstmt.setString(1, s);
			
			int result = ppstmt.executeUpdate();
			System.out.println("�Է¿Ϸ�" + result);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Ŀ�ؼ� ���� ����.");
			e.printStackTrace();
		}
		
	}

}
