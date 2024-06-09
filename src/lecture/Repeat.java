package lecture;

import java.util.Scanner;

public class Repeat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Star star = new Star();
		
		int n = sc.nextInt();
		
		star.Rectangle(n);
		System.out.println();
		star.triangle1(n);
		System.out.println();
		star.triangle2(n);
		System.out.println();
		star.triangle3(n);
		System.out.println();
		star.triangle4(n);
		System.out.println();
		star.pascal_dp(n);
		System.out.println();
		star.pascal_recursion(n);
		System.out.println();
		star.fibonacci(n);
		
		sc.close();
	}
}
