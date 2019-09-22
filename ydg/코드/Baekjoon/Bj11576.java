package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj11576 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int[] zinBub = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int a = zinBub[0];
			int b = zinBub[1];
			
			int size = Integer.parseInt(br.readLine());
			int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int sum =0;
			for(int i=0; i<size; i++) {
				sum+= nums[i] * Math.pow(a, size-1-i);
			}
			String result = "";
			while(true) {
				result = sum%b+" "+ result;
				if(sum/b == 0) break;
				sum = sum/b;
			}
			System.out.println(result);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
