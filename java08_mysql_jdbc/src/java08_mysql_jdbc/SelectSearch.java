package java08_mysql_jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class SelectSearch extends DBConnection {

	public SelectSearch() {
		// 콘솔에 부서코드를 입력받아 해당부서 사원목록(사원번호, 사원명, 업무, 급여, 부서코드) 출력하라.
		
	}
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		System.out.print("부서코드 -> ");
		int deptno = Integer.parseInt(sc.nextLine());
		
		try {
			//데이터베이스 연결
			dbConnection();
			
			//쿼리
			String sql = "select empno, ename, job, sal, deptno from emp where deptno = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			
			//실행
			rs = pstmt.executeQuery();
			
			//데이터 가져오기
			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString(2);
				String job = rs.getString(3);
				double sal = rs.getDouble(4);
				deptno = rs.getInt(5);
				System.out.printf("%d, %s, %s, %8.2f, %d\n", empno, ename, job, sal, deptno);
			}
		} catch (SQLException e) {
			System.out.println("데이터베이스 로딩 중 오류가 발생했습니다.");
		} finally {
			dbClose();
		}
	}

	public static void main(String[] args) {
		new SelectSearch().start();
	}

}
