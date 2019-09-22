package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj1978 {
	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(br.readLine());
			int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			
			int cnt =0;
			boolean flag = true;
			
			for(int i=0; i<size; i++) {
				if(nums[i]<2) flag = false;
				else {
					for(int j=2; j*j<=nums[i]; j++) {
						if(nums[i]%j == 0) {
							flag = false;
							break;
						}
					}
				}
				if(flag) cnt++;
				flag = true;
			}//for
			System.out.println(cnt);
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
