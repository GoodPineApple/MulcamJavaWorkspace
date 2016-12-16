package test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//프로그램 진행 중에 데이터베이스 작업이 필요한 시점에
//아래의 BookDao 클래스 객체를 활용하도록 설계
public class BookDao {
	private final String DB_URL = "jdbc:mysql://70.12.109.120:3306/java";
	private final String DB_ID = "root";
	private final String DB_PW = "sds902";

	
	
	private Connection con;

	public BookDao() {
		// 1. 드라이버 로딩
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 로딩 완료");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 오류");
			e.printStackTrace();
		}
	}

	public void createConnection() {
		// 2. 커넥션 연결
		try {
			con = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);
			System.out.println("커넥션 생성 완료");
		} catch (SQLException e) {
			System.out.println("커넥션 생성 오류");
			e.printStackTrace();
		}
	}

	// DB에 Book 1권의 정보를 입력해주는 메소드
	public int insertBook(BookVO b) {
		PreparedStatement ppstmt = null;
		int result = 0;
		try {
			// 3. SQL 명령어 작성
			String sql = "INSERT INTO BOOKS(TITLE,PUBLISHER,PRICE,YEAR)" + "VALUES(?,?,?,?)";

			// 4. PreapareStatement 객체 생성
			ppstmt = con.prepareStatement(sql);
			ppstmt.setString(1, b.getTilte());
			ppstmt.setString(2, b.getPublisher());
			ppstmt.setInt(3, b.getPrice());
			ppstmt.setString(4, b.getYear());

			// 5. 작성한 SQL문장 데이터베이스에 보내서 실행시키기
			result = ppstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Dao insert 오류");
			e.printStackTrace();
		} finally {
			// 7. 사용이 끝난 자원 반납
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

	// DB에 Book 1권의 정보를 수정해주는 메소드
	public int updateBook(BookVO b) {
		PreparedStatement ppstmt = null;
		int result = 0;
		try {
			// 3. SQL 명령어 작성
			String sql = "UPDATE BOOKS SET PRICE = ?,YEAR=?,WHERE BOOK_ID=?";

			// 4. PreapareStatement 객체 생성
			ppstmt = con.prepareStatement(sql);
			ppstmt.setInt(1, b.getPrice());
			ppstmt.setString(2, b.getYear());
			ppstmt.setInt(3, b.getBookid());

			// 5. 작성한 SQL문장 데이터베이스에 보내서 실행시키기
			result = ppstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Dao update 오류");
			e.printStackTrace();
		} finally {
			// 7. 사용이 끝난 자원 반납
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

	// DB에 Book 1권의 정보를 수정해주는 메소드
	public int deleteBook(int bookid) {
		PreparedStatement ppstmt = null;
		int result = 0;
		try {
			// 3. SQL 명령어 작성
			String sql = "DELETE FROM BOOKS WHERE BOOK_ID=?";

			// 4. PreapareStatement 객체 생성
			ppstmt = con.prepareStatement(sql);
			ppstmt.setInt(1, bookid);

			// 5. 작성한 SQL문장 데이터베이스에 보내서 실행시키기
			result = ppstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Dao delete 오류");
			e.printStackTrace();
		} finally {
			// 7. 사용이 끝난 자원 반납
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

	// 책 한권 조회
	public BookVO selectBook(int bookid) {
		PreparedStatement ppstmt = null;
		ResultSet rs = null;
		BookVO resultbook = null;
		try {
			// 3. SQL 명령어 작성
			String sql = "SELECT BOOK_ID, TITLE" +
					" FROM BOOKS WHERE BOOK_ID=?";

			// 4. PreapareStatement 객체 생성
			ppstmt = con.prepareStatement(sql);
			ppstmt.setInt(1, bookid);

			// 5. 작성한 SQL문장 데이터베이스에 보내서 실행시키기
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
			System.out.println("Dao select 오류");
			e.printStackTrace();
		} finally {
			// 7. 사용이 끝난 자원 반납
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
	
	// 책 여러권 조회
	public List<BookVO> selectBookList() {
		PreparedStatement ppstmt = null;
		ResultSet rs = null;
		List<BookVO> bookList = new ArrayList<>();
		try {
			// 3. SQL 명령어 작성
			String sql = "SELECT BOOK_ID, TITLE,YEAR,PRICE,PUBLISHER FROM BOOKS";

			// 4. PreapareStatement 객체 생성
			ppstmt = con.prepareStatement(sql);

			// 5. 작성한 SQL문장 데이터베이스에 보내서 실행시키기
			rs = ppstmt.executeQuery();
			
			while(rs.next()) {
				BookVO resultbook = new BookVO();
				resultbook.setBookid(rs.getInt(1));
				resultbook.setTilte(rs.getString(2));
				resultbook.setYear(rs.getString(3));
				resultbook.setPrice(rs.getInt(4));
				resultbook.setPublisher(rs.getString(5));
				
				bookList.add(resultbook); // 책 한권을 리스트에 담기
			}
			
			
		} catch (SQLException e) {
			System.out.println("Dao select 오류");
			e.printStackTrace();
		} finally {
			// 7. 사용이 끝난 자원 반납
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
