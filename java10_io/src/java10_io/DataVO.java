package java10_io;

import java.io.Serializable;
import java.util.Calendar;

public class DataVO implements Serializable {
	private int num = 9999;
	private String name = "º’»ÔπŒ";
	private Calendar date;
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public DataVO() {

	}

}
