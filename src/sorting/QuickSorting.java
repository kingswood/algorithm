package sorting;

public class QuickSorting {

	
	public static void sort(int[] original, int l, int r){
		
		int i = l;
		int j = r;
		
		int x = original[l];
		int position = l;
		while(j > i){
			System.out.println("j: " + j + " i: " + i);
			while(j>i&& original[j] >= x){
				--j;
			}
			if(original[j]<x){
				original[position] = original[j];
				original[j] = x;
				position = j;
			}
			
			while(j>i&&original[i] <= x){
				++i;
			}
			
			if(original[i] > x){
				original[position] = original[i];
				original[i] = x;
				position = i;
			}							
		}
		
		
		if(r<=l){
			return;
		}
		
		sort(original, l, position - 1);
		sort(original, position + 1, r);
		
	}
	
	
	public static void main(String[] args){
		
		int[] original = {6,3,7,4,5,2,9,8,2,1};
		
		sort(original, 0, original.length - 1);
		
		for(int i = 0;i<original.length;i++){
			System.out.println(original[i]);
		}
		
	}
	
}
