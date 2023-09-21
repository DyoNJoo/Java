package java07_collection;

//Generic이 가능한 클래스로 만들기
//1글자 대문자로 표기
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
