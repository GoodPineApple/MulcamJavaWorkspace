package test04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ppstmt = null;
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
			Scanner scan = new Scanner(System.in);
			System.out.print("����: ");
			String t = scan.nextLine();
			System.out.print("���ǻ�: ");
			String pb = scan.nextLine();
			System.out.print("����: ");
			int p = scan.nextInt();
			System.out.print("���ǳ⵵: ");
			String y = scan.next();
			
			String sql = "insert into books(title,publisher, price,year)" + 
			"values(?,?,?,?)";
			
			// 4. Statement ��ü ����
			ppstmt = con.prepareStatement(sql);
			ppstmt.setString(1, t);
			ppstmt.setString(2, pb);
			ppstmt.setInt(3, p);
			ppstmt.setString(4, y);
			
			
			// 5. ��ɾ� ���� -> 5.1 executeUpdate : insert, update, delete �ش�
			int result = ppstmt.executeUpdate(sql);
			
			// 6. 5���� �������� ��Ʈ��
			System.out.println("SQL ���� �Ϸ� ��� : " + result);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Ŀ�ؼ� ���� ����:SQLException�߻�");
			e.printStackTrace();
		} finally {
			// 7. 
			if(ppstmt != null) {
				try {
					ppstmt.close();
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
