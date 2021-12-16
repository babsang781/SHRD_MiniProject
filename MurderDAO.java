package miniProject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class MurderDAO {
	// DAO DataBase Access Object
	// db에 접근하기 위한 객체를 만들 수 있는 클래스
	Scanner sc = new Scanner(System.in);
	private Connection conn; // 변수들은 선언만 하면 null 값으로 자동 초기화 = null 할 필요 없음.
	private PreparedStatement psmt; // 기본 자료형은 0이 들어감. 필드, 전역변수일 때만
	private ResultSet rs;
	String sql = "";
	int temp = 0;
	String nick = null;
	String id;

	
////////////////////////////////////////////////////////////////////////
	public int getClue(int clue_id) {
		getConnectioin();
		try {
			sql = "insert into getclue values(?, ?)";
			psmt = conn.prepareStatement(sql); // conn이 psmt 에 sql 쓸 수 있는 권한을 넘겨주고 확인함
			psmt.setInt(1, clue_id); 
			psmt.setString(2, id); 

			temp = psmt.executeUpdate(); // 테이블의 내용이 변경될때

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { 
			close();
		}
		return temp;
	}
	
	public int newStart1(String member_id) {
		//
		int temp2 =0;
		getConnectioin();
		try {
			sql = "delete from getclue where id = ?"; // id 에 해당하는 getclue 를 전부 삭제
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, member_id); 
			temp = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // 어떤 상황이어도 무조~~건 거쳐가는 구문 페이지
			// 먼저 열은 것을 마지막에 닫아야함.
			close();
		}
		return temp;
	}
	public int newStart2(String member_id) {
		//
		int temp2 =0;
		getConnectioin();
		try {
			sql = "delete count from member where id = ?"; // id 에 해당하는 getclue 를 전부 삭제
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, member_id); 
			temp2 = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // 어떤 상황이어도 무조~~건 거쳐가는 구문 페이지
			// 먼저 열은 것을 마지막에 닫아야함.
			close();
		}
		return temp2;
	}
	
	public ArrayList<MurderDTO> selectAll(String id, String pw) {
		ArrayList<MurderDTO> list = new ArrayList<MurderDTO>();
		getConnectioin();
		try {

			// 3.SQL 문 작성 및 실행
			sql = "select * from bigmember where id= 'admin' and pw = '1234' ";
			// ? 를 채워주고 실행하는 객체가 있음.

			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();// 테이블의 변화가 없을 때

			if (rs.next()) {
				System.out.println("로그인 성공");
//					System.out.println(rs.getString("id"));// 테이블 컬럼 이름
//					System.out.println(rs.getString("pw"));
				System.out.println(rs.getString("nickname") + "님 환영합니다.");

				sql = "select * from bigmember";
				psmt = conn.prepareStatement(sql);
				rs = psmt.executeQuery();
				while (rs.next()) {
					String p_id = rs.getString("id");
					String p_pw = rs.getString("pw");
					String p_nickname = rs.getString("nickname");
					MemberDTO m = new MemberDTO(p_id, p_pw, p_nickname);
					list.add(m);
					// 출력만 하는 것이 아니라 데이터를 저장하기 위해서는 DTO에 자료형을 만들어서 변환(transfer) 해줘야 한다.
				}

			} else {
				System.out.println("접근 권한이 없습니다.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // 어떤 상황이어도 무조~~건 거쳐가는 구문 페이지
			// 먼저 열은 것을 마지막에 닫아야함.
			close();
		}
		return list;
	}
	

}
