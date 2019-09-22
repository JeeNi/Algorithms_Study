package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1924 {
	public static void main(String[] args) {
		try {
			//입력
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] num = br.readLine().split(" ");
			int mon = Integer.parseInt(num[0]);
			int day = Integer.parseInt(num[1]);
			
			//달별 일수와 요일
			String[] weeks = {"SUN","MON", "TUE", "WED", "THU", "FRI", "SAT"};
			int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			//계산
			int sum =day; 
			for(int i=0; i<mon; i++)
				sum += days[i];
			System.out.println(weeks[sum%7]);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
