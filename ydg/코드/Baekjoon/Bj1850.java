package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj1850 {
	public static void main(String[] args) {
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			long [] cnt = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
			long a = Math.max(cnt[0], cnt[1]);
			long b = Math.min(cnt[0], cnt[1]);
			long r = a % b;
			while(true) {
				if(r == 0) {
					StringBuilder sb = new StringBuilder();
					for(int i=0; i<b; i++)
						sb.append(1);
					System.out.println(sb.toString());
					break;	
				}
				a = b;
				b = r;
				r= a%b;
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
