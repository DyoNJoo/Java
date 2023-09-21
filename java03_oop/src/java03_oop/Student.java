package java03_oop;


// 1�� �л������� �����Ҽ� �ִ� ��ü
// �г�(int), �̸�(String), ����ó(String), ����(int), ����(int), ����(int)
public class Student extends Object {
	//ĸ��ȭ�� ����
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
	
	//�������̵� �ϴ� �޼ҵ�
	@Override
	public String toString() {
		return "Lv = " + lvl + ", name = " + name + ", tel = " + tel + ", kor = " + kor + ", eng = " + eng + ", math = " + mat;
	}
	
	//Ŭ�����ܺη� ������ �������� �޼ҵ� : getter()
	public int getLevel() {
		//��ɱ���
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
	// Ŭ�����ܺο��� ���� �����Ҽ� �ִ� �޼ҵ� : setter()
	
	//new Student();
	//new Student(2, "ȫ�浿", "010-2345-2345", 60, 25.3, 50);

}
