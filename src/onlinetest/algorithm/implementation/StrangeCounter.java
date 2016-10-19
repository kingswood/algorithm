package onlinetest.algorithm.implementation;

import java.util.Scanner;

public class StrangeCounter {

	
	public static long getStrangeCounter(long n)
    {
		int k = 3;
        long result = -1;

        long top = 1;            
        long p = 1;
        long topValue = 0;

        while (true)
        {
                         
            long next = top + k*p;               

            if (n >= top && n<next)
            {
                break;
            }

            p = p*2;
            top = next;

        }

        topValue = k * p;
        result = topValue - (n - top);            

        return result;

    }
	
	public static void main(String[] args){
		
		long input = 1000000000000l;
		
		Scanner in = new Scanner(System.in);
		
		String t = in.nextLine();
		
		System.out.println(getStrangeCounter(Long.parseLong(t)));
		
	}
	
}
