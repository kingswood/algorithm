package onlinetest;

/*
 * Implement pow(x, n).
 * 
 * for example pow(3, 8)
 * pow(3, 8) = pow(9, 4) = pow(81, 2) =  81 * 81
 * 
 * for example pow(3, 15)
 * pow(3, 15) = pow(9, 7) * 3 = pow(81, 3) * 9 =  81 * 81
 */

public class Pow {

	
	public static int pow(int x, int n){
		
		if(n <= 1){
			return x;
		}
		
		int temp;
		
		int result = -1;
		
		temp = pow(x, n/2);
		
		result = temp * temp;
		
		if(n%2 == 1){
			result = result * x;
		}
		
		// if n < 0 result = 1/result
		
		return result;
	}
	
	public static void main(String[] args){
		
		int result = pow(2, 7);
		
		System.out.println(result);
		
	}
	
}
