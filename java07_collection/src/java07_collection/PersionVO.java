package java07_collection;

import java.util.Calendar;

public class PersionVO {
	
	private int num; //�ο���ȣ
	private Calendar dateTime; //���糯¥, �ð�
	
	public PersionVO() {
		// TODO �ڵ� ������ ������ ����
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
