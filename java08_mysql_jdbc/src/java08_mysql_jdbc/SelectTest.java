package java08_mysql_jdbc;

import java.sql.SQLException;

public class SelectTest extends DBConnection {

	public SelectTest() {
		
	}
	
	public void empList() {
		try {
			//����
			dbConnection();
			
			//����
			String sql = "select empno, ename, job, hiredate, sal from emp order by ename";
			pstmt = con.prepareStatement(sql);
			
			//����
			rs = pstmt.executeQuery();
			
			//ResultSet���� ������ ��������
			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString(2);
				String job = rs.getString(3);
				String hiredate = rs.getString(4);
				double sal = rs.getDouble(5);
				System.out.printf("%8d, %-10s, %-12s, %20s, %8.2f\n", empno, ename, job, hiredate, sal);
			}
		} catch(SQLException e) {
			System.out.println("Prepared ��ü���� ���� �߻�.... " + e.getMessage());
		} finally {
			dbClose(); //DB�ݱ�
		}
	}
	
	public static void main(String[] args) {
		new SelectTest().empList();

	}

}
