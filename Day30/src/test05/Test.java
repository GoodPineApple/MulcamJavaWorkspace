package test05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ppstmt = null;
		ResultSet rs = null; //������� �ڷ���
		
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
			String sql = "select book_id, title, price from books";
			
			// 4. Statement ��ü ����
			ppstmt = con.prepareStatement(sql);
			
			// 5. ��ɾ� ���� -> 5.2 executeQuerry : select �ش�
			rs = ppstmt.executeQuery(sql);
			
			// 6. 5���� �������� ��Ʈ��
			while(rs.next()) {
				int bookid = rs.getInt(1);
				String title = rs.getString(2);
				int price = rs.getInt(3);
				
				System.out.println(bookid +"/"+ title +"/"+ price);
			}
			
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
