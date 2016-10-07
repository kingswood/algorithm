package sorting;

public class BubbleSorting {
	
	
	public static int[] sort(int n, int[] a){
		
		int tmp;
		
		for(int i = 0;i<n -1 ;i++){     //n times
			for(int j = 0;j<n -1;j++){  // n times
				if(a[j] > a[j+1]){  // 1
					tmp = a[j];  // 1
					a[j] = a[j+1]; // 1
					a[j+1] = tmp; //1
				}
			}
		}
		
		//time complexity is O(n2)
		
		return a;
		
	}
	
	public static void main(String[] args){
		
		int[] a = {2,4,6,8,9,4,1,7,5};
		
		sort(a.length, a);
		
		for(int i = 0;i<a.length;i++){
			System.out.print(a[i]);
		}
		
	}
	
}
