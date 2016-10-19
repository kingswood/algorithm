package onlinetest.algorithm.implementation;

public class DivisiableSumPairs {
	
	public static int getDivisiableSumPairs(int[] a, int k){
		
		int result = 0;
		
		for(int i = 0;i<a.length;i++){
			for(int j = i+1;j<a.length;j++){
				if((a[i]+a[j])%k == 0){
					++result;
				}
			}
		}
		
		return result;
		
	}
	
	public static void main(String[] args){
		
		int[] a = {1, 3, 2 ,6 ,1, 2};
		
		int k = 3;
		
		System.out.println(getDivisiableSumPairs(a, k));
		
		
	}
	
}
