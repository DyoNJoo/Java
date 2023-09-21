package java08_mysql_jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class SelectSearch extends DBConnection {

	public SelectSearch() {
		// �ֿܼ� �μ��ڵ带 �Է¹޾� �ش�μ� ������(�����ȣ, �����, ����, �޿�, �μ��ڵ�) ����϶�.
		
	}
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�μ��ڵ� -> ");
		int deptno = Integer.parseInt(sc.nextLine());
		
		try {
			//�����ͺ��̽� ����
			dbConnection();
			
			//����
			String sql = "select empno, ename, job, sal, deptno from emp where deptno = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			
			//����
			rs = pstmt.executeQuery();
			
			//������ ��������
			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString(2);
				String job = rs.getString(3);
				double sal = rs.getDouble(4);
				deptno = rs.getInt(5);
				System.out.printf("%d, %s, %s, %8.2f, %d\n", empno, ename, job, sal, deptno);
			}
		} catch (SQLException e) {
			System.out.println("�����ͺ��̽� �ε� �� ������ �߻��߽��ϴ�.");
		} finally {
			dbClose();
		}
	}

	public static void main(String[] args) {
		new SelectSearch().start();
	}

}
