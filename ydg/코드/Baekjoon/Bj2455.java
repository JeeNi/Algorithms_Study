package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2455 {
	public static void main(String[] args) {
		
		int max = 0;
		int cnt = 0;
		int n = 0; 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			while(cnt++ < 4) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int n1 = Integer.parseInt(st.nextToken());
				int n2 = Integer.parseInt(st.nextToken());
				n +=(n2-n1); 
				max = (max< n) ? n : max ;
			}
			System.out.println(max);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
