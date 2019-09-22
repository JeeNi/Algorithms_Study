package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj2609 {
	public static void main(String[] args) {
		try {
			
			//입력
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int a = Math.max(nums[0], nums[1]);
			int b = Math.min(nums[0], nums[1]);
			int r  = a % b;
			
			//계산
			while(true) {
				if(r == 0) {
					System.out.println(b);
					System.out.println(b * nums[0]/b * nums[1]/b );
					break;
				}else {
					a = b;
					b = r;
					r = a%b;
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
