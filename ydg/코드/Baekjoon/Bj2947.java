package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj2947 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int [] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer:: parseInt).toArray();
			boolean check = true;
			while(true){
				
				if(nums[0] > nums[1]) nums = swap(nums, 0, 1);
				if(nums[1] > nums[2]) nums = swap(nums, 1, 2);
				if(nums[2] > nums[3]) nums = swap(nums, 2, 3);
				if(nums[3] > nums[4]) nums = swap(nums, 3, 4);
				
				for(int i=0; i<5; i++) {
					if(nums[i] != i+1) {
						check = false;
						break;
					}
					else check = true;
				}
				if(check == true) break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int[] swap(int[] n, int s, int e) {
		int tmp;
		tmp = n[s];
		n[s] = n[e];
		n[e] = tmp;

		for (int m : n)
			System.out.print(m + " ");
		System.out.println();

		return n;
	}
}
