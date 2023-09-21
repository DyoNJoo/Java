package java07_collection;

//Generic�� ������ Ŭ������ �����
//1���� �빮�ڷ� ǥ��
//K : key
//V : value
//E : element
//T : 
public class GenericTest<K,V> {
	private K num;
	private V data;
	
	public GenericTest(K num, V data) {
		this.num = num;
		this.data = data;
	}
	
	public K getNum() {
		return num;
	}

	public void setNum(K num) {
		this.num = num;
	}

	public V getData() {
		return data;
	}

	public void setData(V data) {
		this.data = data;
	}

	public GenericTest() {

	}
	
}
