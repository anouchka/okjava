package simplejava;

public class Math {

	public static int lastsum;

	public static void main(String[] args) {
		
		System.out.println(add(2, 3));
		System.out.println(lastsum);
		
		System.out.println(add(3, 5));
		System.out.println(lastsum);
		
		
	}

	public static int add(int a, int b) {
		lastsum = a + b;
		return lastsum;
	}

}
