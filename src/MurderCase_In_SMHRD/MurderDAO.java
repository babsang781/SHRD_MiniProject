package MurderCase_In_SMHRD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MurderDAO {
	// DAO DataBase Access Object
	// db�� �����ϱ� ���� ��ü�� ���� �� �ִ� Ŭ����
	Scanner sc = new Scanner(System.in);
//		MurderDTO dto = new MurderDTO(null, null, null)
	private Connection conn; // �������� ���� �ϸ� null ������ �ڵ� �ʱ�ȭ = null �� �ʿ� ����.
	private PreparedStatement psmt; // �⺻ �ڷ����� 0�� ��. �ʵ�, ���������� ����
	private ResultSet rs;
	String sql = "";
	int temp = 0;
	String temp2;
	String nick = null;
	String id;
	String pw;

	MurderDTO dto = new MurderDTO(id, pw, nick);

	private void getConnection() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String db_url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String db_id = "campus_f_5_1209";
			String db_pw = "smhrd5";

//			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
//			String db_id = "hr";
//			String db_pw = "hr";

			try {
				conn = DriverManager.getConnection(db_url, db_id, db_pw);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	private void close() {

		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public String login(String id, String pw) {

		// �α��� ���
		getConnection();
		String nick = null;

		try {
			sql = "select * from member where member_id = ? and password = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);

			rs = psmt.executeQuery();
			if (rs.next()) {
				nick = rs.getString("nickname");
			}

			dto.setId(id);
			dto.setPw(pw);
			dto.setNick(nick);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return nick;
	}

	public String getNick() {

		return dto.getNick();
	}

	public int join(String id, String pw, String nick) {

		// ȸ������ ���

		getConnection();
		try {
			sql = "insert into member values(? , ? , ?, 0)";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, nick);

			temp = psmt.executeUpdate();

		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			close();
		}

		return temp;

	}

	public void showOpening() {

		// ������

		getConnection();

		try {

			sql = "select * from suspect";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			System.out.println("\n=================================������ ����=========================================");
			System.out.println("������\t" + "����\t" + "����\t\t" + "��ġ\t" + "Ư¡");

			while (rs.next()) {
				String a = rs.getString("name");
				String b = rs.getString("feature");
				String c = rs.getString("room");
				String d = rs.getString("job");
				int e = rs.getInt("age");
				System.out.printf("%s\t%d\t%s\t%s\t%s\n", a, e, d, c, b);
			}
			System.out.println("\n==================================================================================\n");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

	}

	public int showCount(String id) {

		// ī����
		getConnection();

		try {

			sql = "select count from member where member_id = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);

			rs = psmt.executeQuery();
			if (rs.next()) {
				temp = rs.getInt("count");
			}

			System.out.println("���� �� : " + temp);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return temp;

	}

	//////////////////////////////////////////////////////////////////////////

	public int checkClue(int clue_id, String id) {

		getConnection();

		try {
			sql = "select clue_id from getclue where member_id = ? and clue_id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setInt(2, clue_id);

			rs = psmt.executeQuery();

			if (rs.next()) {
				temp = rs.getInt("clue_id");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return temp;
	}

	public void getClue(int clue_id, String id) {
		// ȹ���� ���Ÿ� getclue���̺� insert�ϱ�
		getConnection();
		try {
			sql = "insert into getclue values(?, ?)";
			psmt = conn.prepareStatement(sql); // conn�� psmt �� sql �� �� �ִ� ������ �Ѱ��ְ� Ȯ����
			psmt.setInt(2, clue_id);
			psmt.setString(1, id);

			temp = psmt.executeUpdate(); // ���̺��� ������ ����ɶ�

			// �׽�Ʈ ������ �����
			if (temp > 0) {
//				System.out.println("getclue ���� ����");
			} else {
//				System.out.println("getclue ���� ����");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}

	public int deleteClue(String id) {
		// ������ ���� �� �ش�id�� ȹ���� ���� ��� �����
		getConnection();
		try {
			sql = "delete from getclue where member_id = ?"; // id �� �ش��ϴ� getclue �� ���� ����
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);

			temp = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // � ��Ȳ�̾ ����~~�� ���İ��� ���� ������
			// ���� ���� ���� �������� �ݾƾ���.
			close();
		}
		return temp;
	}

	public int deleteCount(String id) {
		// ������ ���� �� member ���̺��� count�� �ʱ�ȭ�ϱ�
		getConnection();
		try {
			sql = "update member set count = 0 where member_id = ?"; // id �� �ش��ϴ� getclue �� ���� ����
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			temp = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // � ��Ȳ�̾ ����~~�� ���İ��� ���� ������
			// ���� ���� ���� �������� �ݾƾ���.
			close();
		}
		return temp;
	}

	public void ranking() {
		// ��ŷ �ҷ�����
		getConnection();

		try {
			sql = "select * from (select * from rank order by count asc) where rownum <= 10";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			System.out.println("����" + "\t" + "ID" + "\t" + "NICK" + "\t" + "COUNT" + "\t" + "���Ű���");
			System.out.println("=======================================");
			int i = 1;

			while (rs.next()) {

				String a = rs.getString("member_id");
				String b = rs.getString("nickname");
				String c = rs.getString("count");
				String d = rs.getString("cluecount");
//					System.out.println(i + ". \t" + a + " \t" + b + " \t" + c + " \t" + d);
//					System.out.println();
				System.out.printf("%d.\t%2s\t%3s\t%3s\t%3s\n", i, a, b, c, d);
				i++;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

	}

	public int saveRanking(String id, String nick, int cnt) {

		getConnection();

		try {
			sql = "insert into rank(member_id, nickname, count, cluecount) values (?, ?, ?, (select count(clue_id) from getclue where member_id = ?))";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, nick);
			psmt.setInt(3, cnt);
			psmt.setString(4, id);

			temp = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return temp;
	}

	public void showClue(String id) {
		// �߰��� ������ ���� �ҷ�����
		getConnection();

		try {
			sql = "select c.room, c.clue from getclue g, clue c where g.clue_id = c.clue_id and member_id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();

			System.out.println("\n===========================�������===========================\n");
			System.out.println("���ʹ߰��� : ���, 10:47pm ��ü�߰� \n��������ð� 9:30~10:00pm \n ");
			System.out.println("���� : ���������� �ĵκ� �ջ�\n�������� : ����ī�� ����ƽ�ڱ�, ��������(�ð�), ���̾ƹ��� \n"
								+ "������Ư¡ : ������ ü��, �ֱٿ� ������, 2�Ⱓ ����ŷ ���ϰ� ����");
			System.out.println("\n===========================���Ÿ��===========================\n");
			System.out.printf("ȹ�����\t CLUE\n");

			while (rs.next()) {
				String b = rs.getString("room");
				String c = rs.getString("clue");
				System.out.printf("%s\t %s\n", b, c);
			}
			System.out.println("\n============================================================\n");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

	}

	public int save(int cnt, String id) {
		// ī��Ʈ �����ϱ�
		getConnection();

		try {
			sql = "update member set count = ? where member_id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, cnt);
			psmt.setString(2, id);

			temp = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return temp;
	}

	public String checkId(String id) {
		getConnection();

		try {
			sql = "select member_id from member where member_id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);

			rs = psmt.executeQuery();

			if (rs.next()) {
				temp2 = rs.getString("member_id");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return temp2;
	}

}
