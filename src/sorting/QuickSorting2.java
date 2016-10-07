package sorting;

public class QuickSorting2 {

	
	public static void sort(int left, int right, int[] a){
		
		int i = left;
		int j = right;
		
		int position = left;			
		int tmp = a[position];
		
		while(j > i){
			
			
			while(j>i && a[j] >= tmp){
				--j;
				
			}
			if(a[j] < tmp){
				a[position] = a[j];
				a[j] = tmp;
				position = j;
			}
			
			while(j>i && a[i] <= tmp){
				++i;
			}
			
			if(a[i] > tmp){
				a[position] = a[i];
				a[i] = tmp;
				position = i;
			}	
			
			
		}		
		
		if((position - 1) > left)
			sort(left, position - 1, a);
		if(right > (position + 1))
			sort(position + 1, right, a);
						
		
	}
	
	public static void main(String[] args){
		
		int[] a = {2,4,6,8,9,4,1,7,5, 11,22,134,11,22,45,678,5};
		
		sort(0, a.length - 1, a);
		
		for(int i = 0;i<a.length;i++){
			System.out.print(a[i] + ",");
		}
	}
	
}
