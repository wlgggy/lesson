package Generic;

//Generic은 객체를 만들때 어떤 데이터 타입을 사용할지 결정이 되지 않았을때 사용
// 사용방법은 대문자 알파벳을<> 안에 집어 넣어서 사용한다.
// T,S,V,E를 보통 사용하는데 어떠한 알파벳을 상용하여도 무방하다.
//<T> 자료형 매개변수라고 부른다.
//E element, K key, V value 이런 의미로 많이 쓰기는 하지만 의미 없다.

public class Generic3DPrinter<T> {

	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

}
