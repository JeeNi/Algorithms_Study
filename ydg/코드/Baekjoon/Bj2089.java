package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2089 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			long num = Long.parseLong(br.readLine());
			long m  ;
			long r  ;
			StringBuilder sb = new StringBuilder();
			
			while(true) {
				if(num<0 && num%-2 != 0) {
					m =num/-2+1;
					r = num + m*2;
				}else {
					m = num/-2;
					r = num%-2;
				}
				sb.append(r);
				if(m == 0) break;
				num = m;
			}
			
			System.out.println(sb.reverse().toString());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
