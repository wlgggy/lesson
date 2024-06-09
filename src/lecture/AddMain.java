package lecture;

import java.util.Scanner;

public class AddMain {
	public static <T extends Number> T add(T x, T y) {
		if(x instanceof Byte || x instanceof Short || x instanceof Integer || x instanceof Long) {
			return (T) (Number) (x.longValue() + y.longValue());
		} else if (x instanceof Float || x instanceof Double) {
			return (T) (Number) (x.doubleValue() + y.doubleValue());
		} else {
			throw new IllegalArgumentException("Argument type is " + x.getClass());
		}
	}
	
	public static String add(char x, char y) {
		return String.valueOf(x) + String.valueOf(y);
	}
	
	public static boolean add(boolean x, boolean y) {
		return x && y;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        
        Object x, y, sum;
        if(sc.hasNextBoolean()) {
        	x = sc.nextBoolean();
        } else if (sc.hasNextLong()) {
        	x = sc.nextLong();
        }else if (sc.hasNextDouble()){
        	x = sc.nextDouble();
        } else {
        	x = sc.next().charAt(0);
        }
        
        if(sc.hasNextBoolean()) {
        	y = sc.nextBoolean();
        } else if (sc.hasNextLong()) {
        	y = sc.nextLong();
        } else if (sc.hasNextDouble()){
        	y = sc.nextDouble();
        } else {
        	y = sc.next().charAt(0);
        }
        
        if(x instanceof Number && y instanceof Number) {
        	sum = add((Number) x, (Number) y);
        } else if (x instanceof Character && y instanceof Character) {
            sum = Add.add((char) x, (char) y);
        } else if (x instanceof Boolean && y instanceof Boolean) {
            sum = add((boolean) x, (boolean) y);
        }  else {
//        	System.out.println("3");
        	return;
        }
        
        System.out.println(sum);
        sc.close();
	}	
	
}
