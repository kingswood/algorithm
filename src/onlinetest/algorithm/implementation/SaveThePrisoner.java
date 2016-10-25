package onlinetest.algorithm.implementation;

import java.util.Scanner;

public class SaveThePrisoner {
	
	 public static int savePrisoner(int prisonerCount, int sweetCount, int startPosition)
     {
         int position = -1;

         int m = sweetCount%prisonerCount;
         if ((startPosition + m) - 1 > prisonerCount)
         {
             position = (startPosition + m - 1) - prisonerCount;
             
         }
         else
         {
             position = startPosition + m - 1;
         }

         return position;
     }

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		for(int i = 0;i<n;i++){
			
			int prisonerCount = scanner.nextInt();
			
			int sweetCount = scanner.nextInt();
			
			int startPosition = scanner.nextInt();
			
			System.out.println(savePrisoner(prisonerCount, sweetCount, startPosition));
		}
		
		
	}
	
}
