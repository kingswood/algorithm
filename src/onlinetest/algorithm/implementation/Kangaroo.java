package onlinetest.algorithm.implementation;

public class Kangaroo {

	
	public static boolean ifMeet(int x1, int v1, int x2, int v2){
		
		if(x1 >= x2 && v1 >= v2){
			
			// never meet
			return false;
		}else if(x1<=x2 && v1 <= v2){
			
			// never meet
			return false;
		}else{
			
			int behind;
			int front;
			int behindRate;
			int frontRate;
			
			if(x1 < x2){
				behind = x1;
				behindRate = v1;
				front = x2;
				frontRate = v2;
			}else{
				behind = x2;
				behindRate = v2;
				front = x1;
				frontRate = v1;
			}
			
			
			while(behind < front){
				
				behind += behindRate;
				front += frontRate;
				
				if(behind == front){
					return true;
				}
			}
			
		}
			
		return false;
	}
	
	public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();*/
        
        
        
        String result = ifMeet(21,6,47,3)? "YES":"NO";
        
        System.out.println(result);
    }
	
}
