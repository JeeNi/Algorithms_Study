package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj10818 {
	public static void main(String[] args) {
		//입력
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int cnt =  Integer.parseInt(br.readLine());
			int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			
			for(int i =0; i<cnt; i++) {
				max = Math.max(max, nums[i]);
				min = Math.min(min, nums[i]);
			}
			System.out.println(min+" "+max);
			
				
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
