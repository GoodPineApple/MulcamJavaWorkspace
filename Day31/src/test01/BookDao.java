package test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//���α׷� ���� �߿� �����ͺ��̽� �۾��� �ʿ��� ������
//�Ʒ��� BookDao Ŭ���� ��ü�� Ȱ���ϵ��� ����
public class BookDao {
	private final String DB_URL = "jdbc:mysql://70.12.109.120:3306/java";
	private final String DB_ID = "root";
	private final String DB_PW = "sds902";

	
	
	private Connection con;

	public BookDao() {
		// 1. ����̹� �ε�
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("����̹� �ε� �Ϸ�");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
		}
	}

	public void createConnection() {
		// 2. Ŀ�ؼ� ����
		try {
			con = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);
			System.out.println("Ŀ�ؼ� ���� �Ϸ�");
		} catch (SQLException e) {
			System.out.println("Ŀ�ؼ� ���� ����");
			e.printStackTrace();
		}
	}

	// DB�� Book 1���� ������ �Է����ִ� �޼ҵ�
	public int insertBook(BookVO b) {
		PreparedStatement ppstmt = null;
		int result = 0;
		try {
			// 3. SQL ��ɾ� �ۼ�
			String sql = "INSERT INTO BOOKS(TITLE,PUBLISHER,PRICE,YEAR)" + "VALUES(?,?,?,?)";

			// 4. PreapareStatement ��ü ����
			ppstmt = con.prepareStatement(sql);
			ppstmt.setString(1, b.getTilte());
			ppstmt.setString(2, b.getPublisher());
			ppstmt.setInt(3, b.getPrice());
			ppstmt.setString(4, b.getYear());

			// 5. �ۼ��� SQL���� �����ͺ��̽��� ������ �����Ű��
			result = ppstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Dao insert ����");
			e.printStackTrace();
		} finally {
			// 7. ����� ���� �ڿ� �ݳ�
			if (ppstmt != null) {
				try {
					ppstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	// DB�� Book 1���� ������ �������ִ� �޼ҵ�
	public int updateBook(BookVO b) {
		PreparedStatement ppstmt = null;
		int result = 0;
		try {
			// 3. SQL ��ɾ� �ۼ�
			String sql = "UPDATE BOOKS SET PRICE = ?,YEAR=?,WHERE BOOK_ID=?";

			// 4. PreapareStatement ��ü ����
			ppstmt = con.prepareStatement(sql);
			ppstmt.setInt(1, b.getPrice());
			ppstmt.setString(2, b.getYear());
			ppstmt.setInt(3, b.getBookid());

			// 5. �ۼ��� SQL���� �����ͺ��̽��� ������ �����Ű��
			result = ppstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Dao update ����");
			e.printStackTrace();
		} finally {
			// 7. ����� ���� �ڿ� �ݳ�
			if (ppstmt != null) {
				try {
					ppstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	// DB�� Book 1���� ������ �������ִ� �޼ҵ�
	public int deleteBook(int bookid) {
		PreparedStatement ppstmt = null;
		int result = 0;
		try {
			// 3. SQL ��ɾ� �ۼ�
			String sql = "DELETE FROM BOOKS WHERE BOOK_ID=?";

			// 4. PreapareStatement ��ü ����
			ppstmt = con.prepareStatement(sql);
			ppstmt.setInt(1, bookid);

			// 5. �ۼ��� SQL���� �����ͺ��̽��� ������ �����Ű��
			result = ppstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Dao delete ����");
			e.printStackTrace();
		} finally {
			// 7. ����� ���� �ڿ� �ݳ�
			if (ppstmt != null) {
				try {
					ppstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	// å �ѱ� ��ȸ
	public BookVO selectBook(int bookid) {
		PreparedStatement ppstmt = null;
		ResultSet rs = null;
		BookVO resultbook = null;
		try {
			// 3. SQL ��ɾ� �ۼ�
			String sql = "SELECT BOOK_ID, TITLE" +
					" FROM BOOKS WHERE BOOK_ID=?";

			// 4. PreapareStatement ��ü ����
			ppstmt = con.prepareStatement(sql);
			ppstmt.setInt(1, bookid);

			// 5. �ۼ��� SQL���� �����ͺ��̽��� ������ �����Ű��
			rs = ppstmt.executeQuery();
			
			if(rs.next()) {
				resultbook = new BookVO();
				resultbook.setBookid(rs.getInt(1));
				resultbook.setTilte(rs.getString(2));
//				resultbook.setYear(rs.getString(3));
//				resultbook.setPrice(rs.getInt(4));
//				resultbook.setPublisher(rs.getString(5));
			}
			
			
		} catch (SQLException e) {
			System.out.println("Dao select ����");
			e.printStackTrace();
		} finally {
			// 7. ����� ���� �ڿ� �ݳ�
			if (ppstmt != null) {
				try {
					ppstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return resultbook;
	}
	
	// å ������ ��ȸ
	public List<BookVO> selectBookList() {
		PreparedStatement ppstmt = null;
		ResultSet rs = null;
		List<BookVO> bookList = new ArrayList<>();
		try {
			// 3. SQL ��ɾ� �ۼ�
			String sql = "SELECT BOOK_ID, TITLE,YEAR,PRICE,PUBLISHER FROM BOOKS";

			// 4. PreapareStatement ��ü ����
			ppstmt = con.prepareStatement(sql);

			// 5. �ۼ��� SQL���� �����ͺ��̽��� ������ �����Ű��
			rs = ppstmt.executeQuery();
			
			while(rs.next()) {
				BookVO resultbook = new BookVO();
				resultbook.setBookid(rs.getInt(1));
				resultbook.setTilte(rs.getString(2));
				resultbook.setYear(rs.getString(3));
				resultbook.setPrice(rs.getInt(4));
				resultbook.setPublisher(rs.getString(5));
				
				bookList.add(resultbook); // å �ѱ��� ����Ʈ�� ���
			}
			
			
		} catch (SQLException e) {
			System.out.println("Dao select ����");
			e.printStackTrace();
		} finally {
			// 7. ����� ���� �ڿ� �ݳ�
			if (ppstmt != null) {
				try {
					ppstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return bookList;
	}
}
