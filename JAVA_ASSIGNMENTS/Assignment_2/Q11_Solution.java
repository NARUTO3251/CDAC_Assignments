public class Solution{
	public static void main(String[] args){
		check(8);
		check(7);
	}
	
	public static void check(int n){
		if(n<0) n = -n;
		if((n & (n-1))==0)
			System.out.println(n + " is a power of two");
		else
			System.out.println("Oops! " + n + " is not a power of two");	
	} 
}	
