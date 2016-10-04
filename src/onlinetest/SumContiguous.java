package onlinetest;

public class SumContiguous {

	public static int getMaxSumContiguous(int[] a) {

		int max_so_far = 0;
		int max_ending_here = 0;

		for (int i = 0; i < a.length; i++){
			max_ending_here = max_ending_here + a[i];
			if (max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
			}
		}
		
		return max_so_far;

	}
	
	public static void main(String[] args){
		int[] a = {1, -1 , 2, 5, -3, 6, -2, -7, 3};
		
		System.out.println(getMaxSumContiguous(a));
	}

}
