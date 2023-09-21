package java08_mysql_jdbc;

import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

/*
 * �����ȣ�� �Է� �޾� �ش����� ����, �޿�, ���ʽ�, �μ��ڵ带 �����϶�.
 * 
 */

public class UpdateTest extends DBConnection {
	Scanner sc = new Scanner(System.in);
	public UpdateTest() {
		// TODO �ڵ� ������ ������ ����
	}
	
	public void updateStart() {
		//1. �������غ�
		System.out.print("������ �����ȣ = ");
		int empno = Integer.parseInt(sc.nextLine());
		
		System.out.print("������ = ");
		String job = sc.nextLine();
		
		System.out.print("�޿� = ");
		int sal = Integer.parseInt(sc.nextLine());
		
		System.out.print("���ʽ� = ");
		int comm = Integer.parseInt(sc.nextLine());
		
		System.out.print("�μ��ڵ� = ");
		int deptno = Integer.parseInt(sc.nextLine());
		
		try {
			//1. DB����
			dbConnection();
			
			//2. PreparedStatement ��ü ����	   1		2		  3			  4				  5
			String sql = "update emp set job = ?, sal = ?, comm = ?, deptno = ? where empno = ?";
			pstmt = con.prepareStatement(sql);
			//������
			pstmt.setString(1, job);
			pstmt.setInt(2, sal);
			pstmt.setInt(3, comm);
			pstmt.setInt(4, deptno);
			pstmt.setInt(5, empno);
			
			int result = pstmt.executeUpdate();
			if (result > 0) {
				//con.commit();
				System.out.println(result + "���� ���ڵ尡 �����Ǿ����ϴ�.");
			} else {
				//con.rollback();
				System.out.println("������� ������ �����Ͽ����ϴ�.");
			}
		} catch (Exception e) {
			//con.rollback();
			e.printStackTrace();
		} finally {
			dbClose();
		}
	}
	
	public static void main(String[] args) {
		new UpdateTest().updateStart();
		
	}

}
