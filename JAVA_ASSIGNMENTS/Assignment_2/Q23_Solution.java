public class Solution{
	public static void main(String[] args){
		int a = 9
		check(a);
	}
	
	public static void check(int a){
		if((a&1) == 0){
			System.out.println(a + " is even");
		} else {
			System.out.println(a + " is odd");
		}
	}
}	
