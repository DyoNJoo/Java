package java07_collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public TreeMapTest() {
		TreeMap<Integer, MemberVO> tm = new TreeMap<Integer, MemberVO>();
		
		tm.put(600, new MemberVO(600, "박태환", "010-1234-5555", "서울시 종로구"));
		tm.put(200, new MemberVO(200, "홍길동", "010-1111-2222", "강남구"));
		tm.put(100, new MemberVO(100, "이순신", "010-3333-4444", "영등포구"));
		tm.put(300, new MemberVO(300, "안중근", "010-5555-6666", "송파구"));
		tm.put(400, new MemberVO(400, "최길동", "010-7777-8888", "강동구"));
		
		//key이용하여 객체 얻어오기
		MemberVO vo = tm.get(100);
		System.out.println(vo.toString());
		
		Set<Integer> keySet = tm.keySet();
		Iterator<Integer> keyList = keySet.iterator();
		
		while(keyList.hasNext()) {
			Integer key = keyList.next();
			MemberVO mVo = tm.get(key);
			System.out.println(mVo.toString());
		}
		System.out.println("===================================");
		//value만 얻어오기
		Collection<MemberVO> memberList = tm.values();
		Iterator<MemberVO> valueList = memberList.iterator();
		
		while(valueList.hasNext()) {
			MemberVO mVo = valueList.next();
			System.out.println(mVo.toString());
		}
	}
	//
	public static void main(String[] args) {
		new TreeMapTest();

	}

}
