public class WhileLoop {
	public static void main (String[] args) {
		int num = 5;
		System.out.println("Before Looping");
		while (num > 0) {
			System.out.println("In the while-looping ...");
			System.out.println("Num : " + num);
			num = num - 1;
		}
		System.out.println("Finished the Looping");
	}
}
