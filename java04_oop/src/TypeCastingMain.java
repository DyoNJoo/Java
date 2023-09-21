
public class TypeCastingMain {

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("c.num = " + c.num + ", c.username = " + c.username + ", c.age = " + c.age);
		
		//상속 관계에서 하위 클래스 객체를 상위 클래스 객체로 대입을 하면 자동형변환이 됨.
		//하위 클래스를 생성했는데 이 클래스에 상위 클래스인 Parent를 대입한것임.
		Parent p = new Child(); //Parent, Child, Object		두 개는 있고, Child는 숨겨져있음.
		System.out.println("p.num = " + p.num + ", p.username = " + p.username);
		
		//하위클래스의 변수 상위 없어 숨김처리됨.
		//System.out.println("p.num = " + p.num + ", p.username = " + p.username + ", p.age = " + p.age);
		
		//int a = 10;	double b = a;	int c = (int)b;
		
		
		//상위클래스 타임의 instance를 하위클래스 타입으로 대입하기 위해서는 강제 형변환이 필요하다.
		Child c2 = (Child) p;
		System.out.println("c2.num = " + c2.num + ", c2.username = " + c2.username + ", c2.age = " + c2.age);
		
//		Parent pp = new Parent();	//Parent, Object	애초에 Child가 존재하지 않음.
//		Child cc = (Child) pp; //상위클래스 객체 생성후 하위클래스로 형변환은 할수없다
		//애초에 Child가 존재하지 않으므로 Child로의 강제형변환은 불가능함. 해결하는 방법은 하위 클래스 Child를 생성해서 Parent 상위 클래스에 대입해야함.
//		System.out.println(cc.age);
		
		String str = new String("형변환 연습중");
		Object obj = new String("상속과 관계가 있다.");
		Object cObj = new Child(); //Child 객체를 만들어서 Object에 넣는다.
		
		System.out.println(str);
		System.out.println(obj);
		System.out.println(cObj);
		
		System.out.println("----------------------------------------");
		Child mc = new Child();
		mc.numOutput(); //num = 100
		mc.nameOutput(); //이름 = sunsin
		mc.output();
		System.out.println("========================================");
		
		Parent mp = mc; //자동형변환		실제 참조하는 객체는 Child.
		mp.numOutput();
		//mp.output(); //하위클래스를 상위클래스 대입하면 하위에만 있는 메소드는 숨김된다.
		//오버라이딩 메소드는 하위 -> 상위로 형변환하더라도 오버라이딩한 기능이 유지됨.
		mp.nameOutput();
		
		//상위클래스형으로 변환된 객체를 다시 하위클래스로 대입
		Child mc2 = (Child)mp; //다시 하위클래스로 형을 변환한다
		mc2.numOutput();
		mc2.nameOutput();
		mc2.output();
	}

}
