package sorting;

public class MergeSorting {

	
	/*
	 *  2,5,3,5,6,3,0,19,3,5,6,9   n =  12
	 *  2,5,3,5,6,3
	 *  2,5,3
	 *  2,5
	 *  2,3,5
	 *  2,3,3,5,5,6
	 *  			0,3,19
	 *  			0,3,19,5,6,9
	 *  			0,3,5,6,9,19
	 *
	 */
	
	public static void sort(int low, int high, int[] a){
		
		int middle = (high + low)/2;
		
		if(low < high){
			
			sort(low, middle, a); // sort left subarray
			sort(middle + 1, high, a); // sort right subarray
		
			merge(low, high, middle, a);
		}
		
	}
	
	public static void merge(int low, int high, int middle, int[] a){
		
		int i = low;
		int j = middle + 1;
		int k = 0;
		int[] temp = new int[high - low + 1];
		
		
		
		while(i<=middle && j <= high){
			
			//System.out.println("i: "+i+" middle: " + middle + " j: " + j + " high: " + high);
			
			if(a[i] < a[j]){
				temp[k++] = a[i++];

			}else {
				temp[k++] = a[j++];
			}			
		}
		
		while(i <= middle){
			temp[k++] = a[i++];
		}
		
		while(j <= high){
			temp[k++] = a[j++];
		}
		
		for (int k2 = 0; k2 < temp.length; k2++) {  
            a[k2 + low] = temp[k2];  
        }
		
	}
	
	public static void main(String[] args){
		
		int[] original = {6,3,7,4,5,2,9,8,2,1};
		
		sort(0, original.length -1, original);
		
		for(int i = 0;i<original.length;i++){
			System.out.print(original[i]);
		}
		
	}
	
}
