package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1676 {
	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine());
			if(num ==0) {
				System.out.println(0);
				return;
			}
			int cnt=0;
			for(int i=5; i<=num; i*=5) {
				cnt += num/i;
			}
			System.out.println(cnt);
			
			/*
			int twoCnt = 0;
			int fiveCnt = 0;
			for(int i=1; i<=num; i++) {
				int temp = i;
				while((temp%2==0 || temp%5 ==0) && temp >1) {
					if(temp % 2 == 0) {
						twoCnt ++;
						temp = temp/ 2;
					}
					if(temp == 1 ) break;
					
					if(temp % 5==0) {
						fiveCnt++;
						temp = temp/ 5;
					}
				}
			}
			if(twoCnt != 0 && fiveCnt != 0 ) System.out.println(Math.min(twoCnt, fiveCnt));
			else System.out.println(0);
			*/
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
