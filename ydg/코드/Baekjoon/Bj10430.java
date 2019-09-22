package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj10430 {
	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int a = nums[0];
			int b = nums[1];
			int c = nums[2];
			
			System.out.println((a+b)%c);
			System.out.println((a%c + b%c)%c);
			System.out.println((a*b)%c);
			System.out.println((a%c * b%c)%c);
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		
	}
}
