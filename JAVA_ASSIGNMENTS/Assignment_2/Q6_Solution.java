public class Solution{
	public static void main(String[] args){
		int x=8, y=4, z=1;
		int largest = ((x>y && x>z)? x : (y>x && y>z)? y : z);
		System.out.println(largest+ " is the largest number.");
	}
}	
