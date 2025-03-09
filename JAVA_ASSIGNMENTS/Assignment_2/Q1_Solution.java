public class Q01{
	public static void main(String[] args){
		int a = 6;
		int b = 5;
		System.out.println("Before Swapping: \nA = " + a + "\tB = " + b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After Swapping: \nA = " + a + "\tB = " + b);
	}
}
