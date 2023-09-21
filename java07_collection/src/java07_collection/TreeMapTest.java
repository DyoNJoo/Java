package java07_collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public TreeMapTest() {
		TreeMap<Integer, MemberVO> tm = new TreeMap<Integer, MemberVO>();
		
		tm.put(600, new MemberVO(600, "����ȯ", "010-1234-5555", "����� ���α�"));
		tm.put(200, new MemberVO(200, "ȫ�浿", "010-1111-2222", "������"));
		tm.put(100, new MemberVO(100, "�̼���", "010-3333-4444", "��������"));
		tm.put(300, new MemberVO(300, "���߱�", "010-5555-6666", "���ı�"));
		tm.put(400, new MemberVO(400, "�ֱ浿", "010-7777-8888", "������"));
		
		//key�̿��Ͽ� ��ü ������
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
		//value�� ������
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
