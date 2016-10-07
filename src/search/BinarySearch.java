package search;

public class BinarySearch {

	
	public static int binarySearch(int[] a, int key){
		int position = -1;
		
		int low = 0;
		int high = a.length - 1;
				
		while(position == -1){
			
			//int middle = low + (high - low)/2;
			int middle = low + (high - low)*(key - a[low])/(a[high] - a[low]);
			
			if(middle == 0){
				break;
			}
			
			if(a[middle] > key){
				high = middle -1;
			}else if(a[middle] < key){
				low = middle + 1;
			}else{
				// a[middle] == key
				position = middle;
			}
		}
		
		return position;
	}
	
	public static void main(String[] args){
		
		int target = 30;
		int[] a = {12,15,17,19,22,25,27,target,36,49,56,78,99,100};
		//expected result = 7		
		
		System.out.println(binarySearch(a, target));
		
	}
	
}
