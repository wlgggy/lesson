package lecture;

public class Star {
	public void Rectangle(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.print('\n');
		}
	}
	
	public void triangle1(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print('\n');
		}
	}
	
	public void triangle2(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = n - i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.print('\n');
		}
	}
	
	public void triangle3(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(' ');
			}
			for(int j = n - i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void triangle4(int n) {
		for(int i = 0; i<= n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.print('\n');
		}
		
		for(int i = n-1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print('*');
			}
			System.out.print('\n');
		}
	}
	
	public void pascal_dp(int n) {
		int[][] arr = new int[n + 1][n + 1];
		
		for(int i = 0; i < n; i++) {
			arr[i][0] = 1;
		}
		
		for(int i = 1; i < n; ++i) {
			for(int j = 1; j <= i; ++j) {
				arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void pascal_recursion(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(solve(i,j));
			}
			System.out.println();
		}
	}
	
	private int solve(int x, int y) {
		if(x < 0 || y < 0) return 0;
		
		if(y == 0 || x == y) return 1;
		return solve(x-1, y-1) + solve(x-1, y);
	}
	
	public void fibonacci(int n) {
		for(int i = 0; i < n; i++) {
			System.out.print(fibonacci_solve(i) + " ");
		}
		
		System.out.println();
		
		int n1 = 1, n2 = 1, tmp;
		System.out.print("1 1 ");
		for(int i = 0; i < n; tmp = n1, n1 = n2 + tmp, n2 = tmp, i++) {
			System.out.print(n1 + n2 + " ");
		}
	}
	
	private int fibonacci_solve(int idx) {
		if (idx < 2)
			return 1;
		return fibonacci_solve(idx - 1) + fibonacci_solve(idx - 2);
	}
}
