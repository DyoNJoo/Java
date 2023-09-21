package java08_mysql_jdbc;

import java.sql.SQLException;

public class SelectTest extends DBConnection {

	public SelectTest() {
		
	}
	
	public void empList() {
		try {
			//연결
			dbConnection();
			
			//쿼리
			String sql = "select empno, ename, job, hiredate, sal from emp order by ename";
			pstmt = con.prepareStatement(sql);
			
			//실행
			rs = pstmt.executeQuery();
			
			//ResultSet에서 데이터 가져오기
			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString(2);
				String job = rs.getString(3);
				String hiredate = rs.getString(4);
				double sal = rs.getDouble(5);
				System.out.printf("%8d, %-10s, %-12s, %20s, %8.2f\n", empno, ename, job, hiredate, sal);
			}
		} catch(SQLException e) {
			System.out.println("Prepared 객체생성 예외 발생.... " + e.getMessage());
		} finally {
			dbClose(); //DB닫기
		}
	}
	
	public static void main(String[] args) {
		new SelectTest().empList();

	}

}
