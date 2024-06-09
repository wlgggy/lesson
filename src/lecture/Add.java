package lecture;


public class Add {
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
}
