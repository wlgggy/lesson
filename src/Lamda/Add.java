package Lamda;

// 람다식을 사용하려면 한개의 인터페이스에 한개의 메소드만 있어야 한다.
// 람다식을 쓰려면 FunctionalInterface 아노테이션을 사용해야 한다.

@FunctionalInterface
public interface Add {
	public int add(int a, int b);
}
