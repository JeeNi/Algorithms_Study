package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj11005 {
	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int nums[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int n = nums[0];
			int b = nums[1];
			int m = n/b;
			int r = n%b;
			String result = "";
			while(true) {
				if(r>=10) 
					result = (char)(r+55) + result;
				else 
					result = r+ result;
				
				if(m == 0 ) break;
				n = m;
				m = n/b;
				r = n%b;
			}
			System.out.println(result);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
