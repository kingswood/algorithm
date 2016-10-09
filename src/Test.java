
public class Test {
	
	static int[][] getLockerDistanceGrid(int cityLength, int cityWidth, int[] lockerXCoordinates, int[] lockerYCoordinates) {
		if(null == lockerXCoordinates || lockerXCoordinates.length==0 || null == lockerXCoordinates || lockerYCoordinates.length == 0 || lockerXCoordinates.length != lockerYCoordinates.length){			
			throw new RuntimeException("Invalid coordinates");
		}
		
		
		int[][] result = new int[cityWidth][cityLength];
		
		for(int j = 1;j<=cityWidth;j++){
			for(int i = 1; i<=cityLength ;i++){
				result[j-1][i-1] = getShortestPath(i,j, lockerXCoordinates, lockerYCoordinates);
			}
		}
		
		for(int i = 0;i<result.length;i++){
			int[] b = result[i];
			StringBuffer sb = new StringBuffer();
			for( int j = 0;j<b.length;j++){
				sb.append(b[j]);
			}
			System.out.println(sb.toString());
		}
		
		return result;
		
    }
	
	
	
	

    static int getShortestPath(int x, int y, int[] lockerX, int[] lockerY){
        int shortestPath = Integer.MAX_VALUE;
        int distance = 0;
        for(int i = 0;i<lockerX.length;i++){
            distance = Math.abs(lockerX[i] - x) + Math.abs(lockerY[i] - y);
            if(distance < 0){
                distance = -distance;
            }
            if(distance < shortestPath){
                shortestPath = distance;
            }
        }
        return shortestPath;
    }
    

	
	public static void main(String[] args){
		
		int[] x = {2,4};
		int[] y = {3,7};
		
		getLockerDistanceGrid(5,7,x,y);
	}
	
}
