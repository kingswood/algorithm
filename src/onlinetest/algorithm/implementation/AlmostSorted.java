package onlinetest.algorithm.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Node{
	int value;
	int leftValue;
	int rightValue;
}

public class AlmostSorted {
	
	
	
	public static void almostSorted(int[] a){
		
		// check if swap works
		Node first = null;
		Node second = null;
		boolean swapWork = false;
		for(int i = 0;i<a.length - 1;i++){
			if(a[i] > a[i+1]){
				
				if(first == null){
					first = new Node();
					first.value = a[i];
					if((i-1) >=0){
						first.leftValue = a[i-1];
					}else{
						first.leftValue = -1;
					}
					
					if((i+1) < a.length){
						first.rightValue = a[i+1];
					}else{
						first.rightValue = -1;
					}
				}else if(second == null){
					second = new Node();
					second.leftValue = a[i];
					second.value = a[i+1];
					if(i+2 < a.length){
						second.rightValue = a[i+2];
					}else{
						second.rightValue = -1;
						swapWork = true;
					}
				}else{
					// found another unsorted pair then pass
					swapWork = false;
					break;
				}
				
			}
		}
		
		// check if sorted after swapping
		if(swapWork){
			if(second.value >= first.leftValue && second.value <= first.rightValue && first.value >= second.leftValue && (first.value<=second.rightValue && second.rightValue != -1)){
				;
			}else{
				swapWork = false;
			}
		}
		
		Node reverseStart = null;
		Node reverseEnd = null;
		boolean reverseWork = false;
		if(!swapWork){
			// check reverse
			for(int i = 0;i<a.length - 1;i++){
				if(null == reverseStart){
					if(a[i] > a[i+1]){
						
						reverseStart = new Node();
						reverseStart.value = a[i];
						if(i>0){
							reverseStart.leftValue = a[i-1];
						}else{
							reverseStart.leftValue = -1;
						}
					}
				}else if(reverseEnd == null){
					if(a[i] < a[i+1]){
						reverseEnd = new Node();
						reverseEnd.value = a[i];
						reverseEnd.rightValue = a[i+1];
						reverseWork = true;
					}
				}else{
					if(a[i] > a[i+1]){
						reverseWork = false;
						break;
					}
				}
				
			}
			
			if(reverseWork){
				if(reverseEnd.value >= reverseStart.leftValue && reverseStart.value <= reverseEnd.rightValue){
					;
				}else{
					reverseWork = false;
				}
			}
			
		}
		
		if(swapWork){
			System.out.println("swap " + first.value + 1 + " " + second.rightValue + 1);
		}
		
		
		
	}

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		
		while(scanner.hasNext()){
			list.add(new Integer(scanner.nextInt()));
		}
		
		int[] a = new int[list.size()];
		for(int i = 0;i<list.size();i++){
			a[i] = list.get(i).intValue();
		}
		
		almostSorted(a);
		
	}
	
}
