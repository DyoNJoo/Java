package java07_collection;

import java.util.Calendar;

public class PersionVO {
	
	private int num; //부여번호
	private Calendar dateTime; //현재날짜, 시간
	
	public PersionVO() {
		// TODO 자동 생성된 생성자 스텁
	}
	
	public PersionVO(int num, Calendar dateTime) {
		this.num = num;
		this.dateTime = dateTime;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public Calendar getDateTime() {
		return dateTime;
	}
	
	public void setDateTime(Calendar dateTime) {
		this.dateTime = dateTime;
	}

}
