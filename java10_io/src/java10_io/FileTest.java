package java10_io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileTest {

	public FileTest() {
		// File : 드라이브, 폴더, 파일명으로 객체를 생성하여 파일처리를 할수 있는 클래스
		File f1 = new File("C://Users/이민용/Desktop/풀스택/javaFileText");
		File f2 = new File("C://Users/이민용/Desktop/풀스택/javaFileText/sql04.sql");
		File f3 = new File(f1, "test.txt");
		
		//폴더 생성하기
		File f4 = new File("C://Users/이민용/Desktop/풀스택/newFolder");
		if (!f4.exists()) { //폴더의 존재여부 확인 : true -> 존재, false -> 존재하지 않음
			if (f4.mkdir()) { //하위폴더가 없는 경우, mkdirs() -> 하위폴더까지 만들어야 할경우
				System.out.println("폴더가 생성되었습니다.");
			} else {
				System.out.println("폴더 생성에 실패하였습니다.");
			} 
		}
		// 파일 생성하기
		try {
			if (!f3.exists()) {
				if (f3.createNewFile()) {
					System.out.println("파일이 생성되었습니다.");
				} else {
					System.out.println("파일 생성에 실패하였습니다.");
				}
			}
			
			//1970. 1. 1. 00:00:00부터 날짜와 시간을 밀리초로 표시한다.
			long lastDate = f2.lastModified();
			Calendar now = Calendar.getInstance();
			now.setTimeInMillis(lastDate);
			SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
			String lastModified = fmt.format(now.getTime());
			System.out.println("마지막 수정일 : " + lastModified);
			
			// 특정 드라이브의 폴더, 파일목록을 구하기
			File f5 = new File("C://");
			File[] list = f5.listFiles();
			
			//getPath() : 경로 + 파일
			//getName() : 파일명
			//getAbsolutePath() : 경로 + 파일
			//getParent() : 경로
			
			for (File f : list) {
				if (f.isDirectory()) {
					if (f.isHidden()) {
						System.out.println(f.getPath() + "[숨김폴더]");
					} else {
						System.out.println(f.getPath() + "[폴더]");
					}
				} else if (f.isFile()) { //파일 일때
					if (f.isHidden()) {
						System.out.println(f.getPath() + "[숨김파일]");
					} else {
						System.out.println(f.getPath() + "[파일]");
					}
				}
			}
			
			//현재시스템의 드라이브목록구하기
			File[] drive = File.listRoots();
			for(File f : drive) {
				System.out.println(f.getPath());
			}
			
			//용량 확인
			long size = f2.length();
			System.out.println(f2.getName() + "파일크기 -> " + f2.length());
			
			//파일 삭제
			boolean r = f3.delete();
			System.out.println("삭제여부 : " + r);
		}
			catch(IOException e) {
				e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new FileTest();
	}

}
