package ClassExercise;

import java.util.ArrayList;
import java.util.List;

public class LIS {

	 public static void findLIS(int[] arr)
	    {
	        // base case
	        if (arr == null || arr.length == 0) {
	            return;
	        }
	 
	        // LIS[i] stores the longest increasing subsequence of subarray
	        // `arr[0…i]` that ends with `arr[i]`
	        List<List<Integer>> LIS = new ArrayList<>();
	        for (int i = 0; i < arr.length; i++) {
	            LIS.add(new ArrayList<>());
	        }
	 
	        // LIS[0] denotes the longest increasing subsequence ending at `arr[0]`
	        LIS.get(0).add(arr[0]);
	 
	        // start from the second array element
	        for (int i = 1; i < arr.length; i++)
	        {
	            // do for each element in subarray `arr[0…i-1]`
	            for (int j = 0; j < i; j++)
	            {
	                // find the longest increasing subsequence that ends with `arr[j]`
	                // where `arr[j]` is less than the current element `arr[i]`
	 
	                if (arr[j] < arr[i] && LIS.get(j).size() > LIS.get(i).size()) {
	                    LIS.set(i, new ArrayList<>(LIS.get(j)));
	                }
	            }
	 
	            // include `arr[i]` in `LIS[i]`
	            LIS.get(i).add(arr[i]);
	        }
	 
	        
	 
	        // `j` will store an index of LIS
	        int j = 0;
	        for (int i = 0; i < arr.length; i++)
	        {
	            if (LIS.get(j).size() < LIS.get(i).size()) {
	                j = i;
	            }
	        }
	 
	        // print LIS
	        System.out.print(LIS.get(j));
	    }
	 
	    public static void main(String[] args)
	    {
	        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60, 80};
	        findLIS(arr);
	    }
	}

	
