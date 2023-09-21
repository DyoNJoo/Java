package java08_mysql_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertTest {

	Connection con = null;
	PreparedStatement pstmt = null;
	
	public InsertTest() {

	}

	public void start() {
		Scanner sc = new Scanner(System.in);
		// �ֿܼ��� �����ȣ, �̸�, ����, �޿��� �Է¹޾� DB�� �߰�
		System.out.print("�����ȣ -> ");
		int empno = Integer.parseInt(sc.nextLine());
				
		System.out.print("����� -> ");
		String ename = sc.nextLine();
		
		System.out.print("������ -> ");
		String job = sc.nextLine();
		
		System.out.print("�޿� -> ");
		int sal = Integer.parseInt(sc.nextLine());
		
			// 1. jdbc ����̺� �ε�
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
		} catch (ClassNotFoundException e) {
			System.out.println("����̺� �ε��� �����߽��ϴ�." + e.getMessage());
		}
		
		try {
			//2. db����
			String url = "jdbc:mysql://localhost/mydb";
			String username = "root";
			String password = "tiger1234";
			con = DriverManager.getConnection(url, username, password);
			
			//3. ������ -> PreparedStatemant ����
			String sql = "insert into emp(empno, ename, job, hiredate, sal) values(?, ?, ?, now(), ?)";
			pstmt = con.prepareStatement(sql);
			
			//?�� �ִ� �������� ���� ��������� ��.
			pstmt.setInt(1, empno);
			pstmt.setString(2, ename);
			pstmt.setString(3, job);
			pstmt.setInt(4, sal);
			
			//4. ����  insert�� ���ڵ� �� ��ȯ
			int result = pstmt.executeUpdate();
			
			if (result > 0) {
				System.out.println("����� ��ϵǾ����ϴ�.");
			}
			else {
				System.out.println("��� ��Ͽ� �����Ͽ����ϴ�.");
			}
			
		} catch (SQLException e) {
			System.out.println("DB���ῡ �����Ͽ����ϴ�." + e.getMessage());
		} finally {
			 try {
				//DB�ݱ�
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
			} catch(SQLException e) {
				System.out.println("�ݱ� ���� �߻�..." + e.getMessage());
			}
		}
	}
	public static void main(String[] args) {
		new InsertTest().start();
	}

}
