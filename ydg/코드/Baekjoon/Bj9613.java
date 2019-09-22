package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj9613 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int cnt = Integer.parseInt(br.readLine());
			int[] nums;
			int a ;
			int b ;
			int r ;
			for(int i=0; i<cnt; i++) {
				nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
				int sum=0;
				for(int j=1; j<nums[0]; j++) {
					for(int k=j+1; k<nums[0]+1; k++) {
						a = Math.max(nums[j], nums[k]);						
						b = Math.min(nums[j], nums[k]);
						r = a%b ;
						while(true) {
							if(r == 0) {
								sum+=b;
								break ;
							}//if
							a = b;
							b = r ;
							r = a % b;
						}//while
					}//for k
				}//for j
				System.out.println(sum);
			}//for i
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
}
