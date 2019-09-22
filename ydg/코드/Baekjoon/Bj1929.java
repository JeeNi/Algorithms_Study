package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj1929 {
	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int m = Math.min(nums[0], nums[1]);
			int n = Math.max(nums[0], nums[1]);
			int[] map = new int[n];
			for(int i=m-1; i<map.length; i++)
				map[i] = i+1;
			
	/*		for(int i : map)
				System.out.println(i);*/
			
			for(int i=2; i*i<=n; i++) {
				for(int j =0; j<map.length; j++) {
					if(map[j] == 1 ) map[j] = -1;
					if(i != map[j] && map[j] != -1 &&map[j]%i ==0 ) map[j] = -1;
				}
			}
			for(int i=0; i<map.length; i++)
				if(map[i] != -1) System.out.println(map[i]);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
