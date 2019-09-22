package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj3047 {
	public static void main(String[] args) {
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			Arrays.sort(nums);
			
			String str = br.readLine();
			for(int i=0; i<3; i++) {
				switch (str.charAt(i)) {
				case 'A':
					System.out.print(nums[0]+" ");
					break;
				case 'B' :
					System.out.print(nums[1]+" ");
					break;
				case 'C':
					System.out.print(nums[2]+" ");
					break;
				}
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
