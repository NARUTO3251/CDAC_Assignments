public class Solution{
	public static void main(String[] args){
		swapper(10);
		swapper(9);
	}
	
	public static void swapper(int x){ 
	    int evenBits = (x & 0xAAAAAAAA) >> 1; 
        int oddBits = (x & 0x55555555) << 1;   
        int res = (evenBits | oddBits);   
		System.out.println(res);
	} 
}	


