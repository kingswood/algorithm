package onlinetest.algorithm.implementation;

import java.util.Scanner;

public class SaveThePrisoner {
	
	public static int getLastPrisoner(int n, int m, int s){
		
		int lastPosition = 0;
		
		if((s + m - 1) <= n){
			lastPosition = s + m -1;
		}
		
		return lastPosition;
	}

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		int prisonerCount = scanner.nextInt();
		
		int sweetCount = scanner.nextInt();
		
		int startPosition = scanner.nextInt();
		
		
	}
	
}
