package java08_mysql_jdbc;

import java.util.Scanner;

public class DeleteTest extends DBConnection {

	public DeleteTest() {
		// TODO �ڵ� ������ ������ ����
	}

	public void deleteEmp() {
		//�����ȣ�� �Է¹޾� �Է¹��� ����� �����϶�.
		Scanner sc = new Scanner(System.in);
		System.out.print("�����ȣ -> ");
		int empno = sc.nextInt();
		try {
			dbConnection();
			String sql = "delete from emp where empno = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, empno);
			
			int result = pstmt.executeUpdate();
			
			if (result > 0) {
				System.out.println(result + "���� ���ڵ尡 ���������� �����Ǿ����ϴ�.");
			}
			else {
				System.out.println("������ ���ڵ尡 �����ϴ�.");
			}
		} catch (Exception e) {
			e.printStackTrace();	
		} finally {
			dbClose();
		}
	}
	public static void main(String[] args) {
		new DeleteTest().deleteEmp();

	}

}
