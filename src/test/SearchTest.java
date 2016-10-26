package test;

public class SearchTest {
	
	public static int binarySearch(int[] a, int key){
		
		int low = 0;
		int high = a.length - 1;
		
		int middle;
		
		while(true){
			middle = low + (high - low)*(key - a[low])/(a[high] - a[low]);
			
			if(middle == 0){
				break;
			}
			if(a[middle] == key){
				return middle;
			}else if(a[middle] > key){
				high = middle-1;
			}else{
				low = middle+1;
			}
		}
		
		return -1;
		
	}
	
	public static void main(String[] args){
		
		int target = 20;
		
		int[] a = {2,4,6,8,10,15,17,target,29,35,37,39,50};
		
		System.out.println(binarySearch(a, target));
		
	}
	
	
}
