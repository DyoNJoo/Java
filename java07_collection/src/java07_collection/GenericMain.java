package java07_collection;

public class GenericMain {

	public GenericMain() {
		// TODO 자동 생성된 생성자 스텁
	}

	public static void main(String[] args) {
		GenericTest<Integer, String> gt = new GenericTest(1234, "영등포구");
		Integer i = gt.getNum();
		String s = gt.getData();
		System.out.println(i + " --> " + s);
		
		GenericTest<String, MemberVO> gt2 = new GenericTest("홍", new MemberVO(100 ,"길동", "010-1234-5678", "마포구"));
		String name = gt2.getNum();
		MemberVO vo = gt2.getData();
		
		System.out.println("name -> " + name);
		System.out.println(vo.toString());

	}

}
