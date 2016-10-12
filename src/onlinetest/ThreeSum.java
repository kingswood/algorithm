package onlinetest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique 
 * triplets in the array which gives the sum of zero.
 * 
 * For example, given array S = [-1, 0, 1, 2, -1, -4],

	A solution set is:
	[
  		[-1, 0, 1],
  		[-1, -1, 2]
	]
 * 
 */

public class ThreeSum {

	public static List<List<Integer>> threeSum(int[] nums) {
	    List<List<Integer>> result = new ArrayList<List<Integer>>();
	 
	    if(nums == null || nums.length<3)
	        return result;
	 
	    Arrays.sort(nums);
	 
	    for(int i=0; i<nums.length-2; i++){ //n
	        if(i==0 || nums[i] > nums[i-1]){
	            int j=i+1;
	            int k=nums.length-1;
	 
	            while(j<k){ //n
	                if(nums[i]+nums[j]+nums[k]==0){
	                    List<Integer> l = new ArrayList<Integer>();
	                    l.add(nums[i]);
	                    l.add(nums[j]);
	                    l.add(nums[k]);
	                    result.add(l);
	 
	                    j++;
	                    k--;
	 
	                    //handle duplicate here
	                    while(j<k && nums[j]==nums[j-1])
	                        j++;
	                    while(j<k && nums[k]==nums[k+1])
	                        k--;
	 
	                }else if(nums[i]+nums[j]+nums[k]<0){
	                    j++;
	                }else{
	                    k--;
	                }
	            }
	        }
	 
	    }
	 
	    return result;
	}
	
	public static void main(String[] args){
		
		int[] original = {-1, 0, 1, 2, -1, -4};
		
		List list = threeSum(original);
		
		for(int i = 0;i<list.size();i++){
			List<Integer> l = (List<Integer>)list.get(i);
			for(int j = 0;j<l.size();j++){
				System.out.print(l.get(j));
			}
			System.out.println();
		}
	}
	
}
