package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj2959 {
	
	public static void main(String[] args) {
		BufferedReader br;
		String[] nums;
		try {
			
			br = new BufferedReader(new InputStreamReader(System.in));
			nums = br.readLine().split(" ");
			
			Arrays.sort(nums);
						
			System.out.println(Integer.parseInt(nums[0])*Integer.parseInt(nums[2]));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
