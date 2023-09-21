package java07_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public HashMapTest() {
		//HashMap : Ű�� value�� ������ �÷���
		
		HashMap<Integer, MemberVO> hm = new HashMap<Integer, MemberVO>();
		
		hm.put(200, new MemberVO(200, "ȫ�浿", "010-1111-2222", "������"));
		hm.put(100, new MemberVO(100, "�̼���", "010-3333-4444", "��������"));
		hm.put(300, new MemberVO(300, "���߱�", "010-5555-6666", "���ı�"));
		hm.put(400, new MemberVO(400, "�ֱ浿", "010-7777-8888", "������"));
		
		//get() : Ű���� ���� ��� Ű�� �ش��ϴ� ��ü�� ������
		MemberVO vo = hm.get(300);
		System.out.println(vo.toString());
		System.out.println("-----------------------------");
		//keySet() : HashMap�� Ű���鸸 Set���� �������ش�.
		Set<Integer> keyList = hm.keySet();
		Iterator<Integer> ii = keyList.iterator();
		
		while(ii.hasNext()) {
			Integer key = ii.next();
			MemberVO m = hm.get(key);
			System.out.println(m.toString());
		}
		
		System.out.println("-----------------------------");
		//entrySet() : key, value�� �ϳ��� ��Ʈ(entry)�� ����� Set���� �����Ѵ�.
		Set entryList = hm.entrySet();
		Iterator iii = entryList.iterator();
		
		while(iii.hasNext()) {
			Map.Entry<Integer, MemberVO> entry = (Map.Entry)iii.next();
			
			Integer key = entry.getKey();
			MemberVO value = entry.getValue();
			System.out.println(value.toString());
		}
	}

	public static void main(String[] args) {
		HashMapTest hm = new HashMapTest();

	}

}
