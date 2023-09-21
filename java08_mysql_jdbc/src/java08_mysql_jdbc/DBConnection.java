package java08_mysql_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {

	protected Connection con = null;
	protected PreparedStatement pstmt = null;
	protected ResultSet rs = null;
	
	String url = "jdbc:mysql://127.0.0.1/mydb";
	String username = "root";
	String password = "tiger1234";
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch(ClassNotFoundException e) {
			System.out.println("����̺� �ε� ���� �߻�");
		}
	}
	
	public DBConnection() {
		// TODO �ڵ� ������ ������ ����
	}
	
	//DB ����
	public void dbConnection() {
		try {
			con = DriverManager.getConnection(url, username, password);
		} catch(Exception e) {
			System.out.println("DB���� ���ܹ߻� .... " + e.getMessage());
		}
	}
	//DB �ݱ�
	public void dbClose() {
		try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(con != null) con.close();
		} catch(Exception e) {
			System.out.println("DB�ݱ� ���� �߻�... " + e.getMessage());
		}
	}
}