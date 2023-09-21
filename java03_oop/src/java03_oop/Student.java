package java03_oop;


// 1명 학생정보를 보관할수 있는 객체
// 학년(int), 이름(String), 연락처(String), 국어(int), 영어(int), 수학(int)
public class Student extends Object {
	//캡슐화된 변수
	private int lvl; // 0
	private String name; // null
	private String tel;
	private int kor, mat;
	private double eng;
	private boolean pass; // false
	
	public Student() {
	
	}
	
	public Student(int lvl, String name, String tel, int kor, double eng, int mat) {
		this.lvl = lvl;
		this.name = name;
		this.tel = tel;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	//오버라이딩 하는 메소드
	@Override
	public String toString() {
		return "Lv = " + lvl + ", name = " + name + ", tel = " + tel + ", kor = " + kor + ", eng = " + eng + ", math = " + mat;
	}
	
	//클래스외부로 값으로 내보내는 메소드 : getter()
	public int getLevel() {
		//기능구현
		return lvl;
	}
	
	public void setLevel(int lvl) {
		this.lvl = lvl;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public int getKor() {
		return kor;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public double getEng() {
		return eng;
	}
	
	public void setEng(double eng) {
		this.eng = eng;
	}
	
	public int getMath() {
		return mat;
	}
	
	public void setMath(int mat) {
		this.mat = mat;
	}
	
	public boolean isPass() {
		return pass;
	}
	
	public void setPass(boolean pass) {
		this.pass = pass;
	}
	// 클래스외부에서 값을 변경할수 있는 메소드 : setter()
	
	//new Student();
	//new Student(2, "홍길동", "010-2345-2345", 60, 25.3, 50);

}
