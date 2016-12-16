package metro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MetroDao {

	private final String DB_URL = "jdbc:mysql://70.12.109.112:3306/metro";
	private final String DB_ID = "root";
	private final String DB_PW = "sds902";

	private Connection con;

	public MetroDao() {
		// 1. 드라이버 로딩
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 오류");
			e.printStackTrace();
		}
	}

	public void createConnection() {
		// 2. 커넥션 연결
		try {
			con = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);
		} catch (SQLException e) {
			System.out.println("커넥션 생성 오류");
			e.printStackTrace();
		}
	}

	public void closeConnection() {
		// 2. 커넥션 연결해제
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// GUI 필요 메소드
	public MetroVO selectInfo(int stnnum) { // 출발or도착역번호입력
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MetroVO resultStations = null;

		try {
			// 3. SQL 명령어 작성
			String sql = "SELECT STN, STNNUM, STNLINE, TOILET,STORAGE,OTHERSIDE,TRANSFER" + " FROM STATIONS WHERE STNNUM=?";
			// 4. PreparedStatement 객체 생성
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, stnnum);

			// 5. 작성한 SQL 문장 데이터베이스에 보내서 실행시키기
			rs = pstmt.executeQuery();

			if (rs.next()) {
				resultStations = new MetroVO();
				resultStations.setStn(rs.getString(1));
				resultStations.setStnnum(rs.getInt(2));
				resultStations.setStnline(rs.getInt(3));
				resultStations.setToilet(rs.getBoolean(4));
				resultStations.setStorage(rs.getBoolean(5));
				resultStations.setOtherside(rs.getBoolean(6));
				resultStations.setTransfer(rs.getBoolean(7));
			}

		} catch (SQLException e) {
			System.out.println("Dao update 에러");
			e.printStackTrace();
		} finally {
			// 7. 사용이 끝난 자원 반납
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return resultStations;
	}

	// 다익스트라 필요 메소드
	public MetroVO selectDijkStations(int stnnum) { // 출발or도착역번호입력
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MetroVO resultStations = null;

		try {
			// 3. SQL 명령어 작성
			String sql = "SELECT STN , STNNUM , STNLINE,DURATION, TRANSFER,"
					+ "DIJKNUM, CLOSETRANSFERSTN1, CLOSETRANSFERSTN2" + " FROM STATIONS WHERE STNNUM=?";
			// 4. PreparedStatement 객체 생성
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, stnnum);

			// 5. 작성한 SQL 문장 데이터베이스에 보내서 실행시키기
			rs = pstmt.executeQuery();

			if (rs.next()) {
				resultStations = new MetroVO();
				resultStations.setStn(rs.getString(1));
				resultStations.setStnnum(rs.getInt(2));
				resultStations.setStnline(rs.getInt(3));
				resultStations.setDuration(rs.getInt(4));
				resultStations.setTransfer(rs.getBoolean(5));
				resultStations.setDijknum(rs.getInt(6));
				resultStations.setClosetransferstn1(rs.getInt(7));
				resultStations.setClosetransferstn2(rs.getInt(8));

			}

		} catch (SQLException e) {
			System.out.println("Dao update 에러");
			e.printStackTrace();
		} finally {
			// 7. 사용이 끝난 자원 반납
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return resultStations;
	}

	// 모든역정보 DB출력
	public List<MetroVO> selectStationList() {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<MetroVO> stationList = new ArrayList<>();
		try {
			// 3. SQL 명령어 작성
			String sql = "SELECT * FROM STATIONS";

			// 4. PreparedStatement 객체 생성
			pstmt = con.prepareStatement(sql);

			// 5. 작성한 SQL 문장 데이터베이스에 보내서 실행시키기
			rs = pstmt.executeQuery();

			while (rs.next()) {
				MetroVO resultStation = new MetroVO();
				resultStation.setStn(rs.getString(1));
				resultStation.setStnnum(rs.getInt(2));
				resultStation.setStnline(rs.getInt(3));
				resultStation.setDuration(rs.getInt(4));
				resultStation.setToilet(rs.getBoolean(5));
				resultStation.setStorage(rs.getBoolean(6));
				resultStation.setOtherside(rs.getBoolean(7));
				resultStation.setTransfer(rs.getBoolean(8));
				resultStation.setDijknum(rs.getInt(9));
				resultStation.setClosetransferstn1(rs.getInt(10));
				resultStation.setClosetransferstn2(rs.getInt(11));

				stationList.add(resultStation);// 역 한정보를 리스트에담기
			}

		} catch (SQLException e) {
			System.out.println("Dao update 에러");
			e.printStackTrace();
		} finally {
			// 7. 사용이 끝난 자원 반납
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return stationList;
	}
}

////////////////////////////////////////////////////////////////////////////////////
class MetroDaoinfo extends MetroDao {
	private String stn;
	private int stnnum;
	private int stnline;
	private boolean toilet;
	private boolean storage;
	private boolean otherside;
	private boolean transfer;
	private int dijknum;
	private int closetransferstn1;
	private int closetransferstn2;

	public MetroDaoinfo(int stnnum) {
		stn = selectDijkStations(stnnum).getStn();

	}

}
