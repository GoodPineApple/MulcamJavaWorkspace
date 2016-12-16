package test06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PpStmInsert {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ppstmt = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 로딩 완료.");
			
			String url = "jdbc:mysql://70.12.109.120:3306/java";
			String id = "root";
			String pw = "sds902";
			
			con = DriverManager.getConnection(url, id, pw);
			
			Scanner scan = new Scanner(System.in);
			System.out.print("제목: ");
			String t = scan.nextLine();
			System.out.print("가수: ");
			String s = scan.nextLine();
			System.out.print("재생수: ");
			int l = scan.nextInt();
			System.out.print("소속사: ");
			String c = scan.next();
			
			String sql = "insert into KHiphop(title, singer, listenerpop, company)" +
			"values(?,?,?,?)";
			
			ppstmt = con.prepareStatement(sql);
			ppstmt.setString(1, t);
			ppstmt.setString(2, s);
			ppstmt.setInt(3, l);
			ppstmt.setString(4, c);
			
			int result = ppstmt.executeUpdate();
			System.out.println("SQL작업결과" + result);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("컨넥션 오류 SQLException.");
			e.printStackTrace();
		} finally {
			if (ppstmt != null) {
				try {
					ppstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
