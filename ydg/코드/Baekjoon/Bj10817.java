package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj10817 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			Arrays.sort(nums);
			
			System.out.println(nums[1]);
			/*
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			
			for(int i=0; i<nums.length-1; i++) {
				for(int j=0; j<nums.length; j++) {
					max = Math.max(nums[i], nums[j]);
					min = Math.min(nums[i], nums[j]);
				}
			}
			
			System.out.println(max);
			System.out.println(min);
			System.out.println(Arrays.binarySearch(nums, max));
			System.out.println(Arrays.binarySearch(nums, min));
			//System.out.println(nums[6-Arrays.binarySearch(nums, max)-Arrays.binarySearch(nums, min)]);
*/			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
