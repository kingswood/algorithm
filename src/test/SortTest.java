package test;

public class SortTest {
	
	
	public static void bubbleSort(int[] a){
		
		for(int i = 0;i<a.length;i++){
			for(int j = i+1;j<a.length;j++){
				int tmp = -1;
				if(a[j] < a[i]){
					tmp = a[j];
					a[j] = a[i];
					a[i] = tmp;
				}
			}
		}
		
	}
	
	public static void insertionSort(int[] a){
		
		for(int i = 1;i<a.length;i++){
			
			if(a[i] < a[i-1]){
				int j = i;
				
				while(j>0 && a[j] < a[j-1]){
					int tmp = -1;
					tmp = a[j];
					a[j] = a[j-1];
					a[j-1] = tmp;
					j--;
				}
				
			}
			
		}
		
	}
	
	public static void quickSort(int[] a){
		quickSort(a, 0, a.length-1);
	}
	
	public static void quickSort(int[] a, int left, int right){
		
		//System.out.println("left: " + left + " right: " + right);
		
		if(right <= left || left >= a.length){
			return;
		}
		
		int i = left;
		int j = right;
		int position = left;
		
		
		int x = a[left];
		
		while(i<j){
			
			while(i<j && a[j] >= x){
				j--;
			}
			
			if(a[j] < x){			
				a[position] = a[j];
				a[j] = x;
				position = j;
			}
			
			while(i<j && a[i] <= x){
				i++;
			}
			
			if(a[i] > x){
				a[position] = a[i];
				a[i] = x;
				position = i;
			}
		}
		
		
		
		if(position != left){
			quickSort(a, left, position - 1);
		}
		
		quickSort(a, position + 1, right);
	}
	
	
	public static void mergetSort(int[] a){
		mergeSort(a, 0, a.length - 1);
	}
	
	public static void mergeSort(int[] a, int low, int high){
		
		if(low < high){
			int middle = (low + high)/2;
			
			mergeSort(a, low, middle);
			mergeSort(a, middle + 1, high);
			
			merge(a, low, high, middle);
		}
	}
	
	public static void merge(int[] a, int low, int high, int middle){
		
		int i = low;//0
		int m = middle + 1;//0 high=1
		
		int[] tmp = new int[high - low + 1];
		
		int k = 0;
		
		while(i<=middle && m<=high){
			
			if(a[i] <= a[m]){
				tmp[k++] = a[i++];
			}else{
				tmp[k++] = a[m++];
			}
			
		}
		
		while(i<=middle){
			tmp[k++] = a[i++];
		}
		
		while(m <= high){
			tmp[k++] = a[m++];
		}
		
		
		for(int l = 0;l<tmp.length;l++){
			a[low + l] = tmp[l];
			i++;
		}
		
	}
	
	
	
	
	public static int[] initialArray(int count){
		
		int[] a = new int[count];
		
		for(int i = 0;i<count;i++){
			a[i] = (int)(Math.random() * 100000);
		}
		
		return a;
	}
	
	public static void print(int[] a){
		for(int i = 0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args){
		
		int count = 1000000;
		
		int[] a = initialArray(count);
		
		long start1 = System.currentTimeMillis();
		bubbleSort(a);
		long end1 = System.currentTimeMillis();
		System.out.println("Bubble sort cost : " + (end1 - start1) + " ms.");
		
		a = initialArray(count);
		long start2 = System.currentTimeMillis();
		insertionSort(a);
		long end2 = System.currentTimeMillis();
		System.out.println("Insertion sort cost : " + (end2 - start2) + " ms.");
		
		a = initialArray(count);
		long start3 = System.currentTimeMillis();
		quickSort(a);
		long end3 = System.currentTimeMillis();
		System.out.println("Quick sort cost : " + (end3 - start3) + " ms.");
		
		a = initialArray(count);
		long start4 = System.currentTimeMillis();
		mergetSort(a);
		long end4 = System.currentTimeMillis();
		System.out.println("Merge sort cost : " + (end4 - start4) + " ms.");
		
		
		//print(a);
	}
	
}
