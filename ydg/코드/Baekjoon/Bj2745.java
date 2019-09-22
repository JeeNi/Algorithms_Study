package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2745 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] nums = br.readLine().split(" ");
			
			int sum =0;
			int t = nums[0].length()-1;
			int n ;
			for(int i = 0; i<nums[0].length(); i++ ) {
				if((int)nums[0].charAt(i) >= 65 &&(int)nums[0].charAt(i)<=90)
					n = (int)nums[0].charAt(i)-55;
				else n = Integer.parseInt(nums[0].substring(i, i+1));
				
				sum += Math.pow(Integer.parseInt(nums[1]), t--) * n;
			}
			System.out.println(sum);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
