package sorting;

public class InsertionSorting {
	
	
	public static void sort(int n, int[]a){
		
		int tmp;
		
		for(int i = 1; i< n; i++){ //n
			
			if(a[i] < a[i-1]){ // 1				
				int j = i; // 1
				while(j > 0 && a[j] < a[j-1]){ 
					tmp = a[j]; // 1
					a[j] = a[j - 1]; // 1
					a[j-1] = tmp; // 1
					j--; // 1
				}							
			}
			
		}
		
	}
	
	public static void main(String[] args){
		
		int[] a = {2,4,6,8,9,4,1,7,5, 11,22,134,11,22,45,678,5};
		
		sort(a.length, a);
		
		for(int i = 0;i<a.length;i++){
			System.out.print(a[i] + ",");
		}
	}
	
}
