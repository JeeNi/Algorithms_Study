package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj13335 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()); //트럭 개수
			int w = Integer.parseInt(st.nextToken()); //다리의 길이
			int l = Integer.parseInt(st.nextToken()); //최대 하중 = max값
			
			int cnt = 0; //걸린 시간
			
			
			
			System.out.println(cnt+1);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
