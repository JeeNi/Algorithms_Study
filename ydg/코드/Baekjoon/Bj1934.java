package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj1934 {
	public static void main(String[] args) {
		
		try {
			//입력 
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int cnt = Integer.parseInt(br.readLine());
			int[] nums = new int[cnt*2];
			int[] temp;
			int a;
			int b;
			int r ;
			for(int i=0; i<cnt*2; i+=2) {
				 temp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
				 nums[i] = temp[0];
				 nums[i+1] = temp[1];
				 
				 a =  Math.max(nums[i], nums[i+1]);
				 b =  Math.min(nums[i], nums[i+1]);
				 r = a % b;
				 while(true) {
					 if(r == 0) {
						 System.out.println(b * nums[i]/b * nums[i+1]/b);
						 break;
					 }
					 a = b;
					 b = r;
					 r = a %b;
				 }
			}
			
			
			
				
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
