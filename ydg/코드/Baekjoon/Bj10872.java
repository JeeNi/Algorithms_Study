package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj10872 {
	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine());
			if(num == 0) {
				System.out.println(1);
				return;
			}
			
			int mul = 1;
			for(int i=1; i<=num; i++)
				mul *= i;
			System.out.println(mul);
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
