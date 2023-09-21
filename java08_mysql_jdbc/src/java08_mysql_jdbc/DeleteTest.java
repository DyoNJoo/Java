package java08_mysql_jdbc;

import java.util.Scanner;

public class DeleteTest extends DBConnection {

	public DeleteTest() {
		// TODO 자동 생성된 생성자 스텁
	}

	public void deleteEmp() {
		//사원번호를 입력받아 입력받은 사원을 삭제하라.
		Scanner sc = new Scanner(System.in);
		System.out.print("사원번호 -> ");
		int empno = sc.nextInt();
		try {
			dbConnection();
			String sql = "delete from emp where empno = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, empno);
			
			int result = pstmt.executeUpdate();
			
			if (result > 0) {
				System.out.println(result + "개의 레코드가 정상적으로 삭제되었습니다.");
			}
			else {
				System.out.println("삭제된 레코드가 없습니다.");
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
