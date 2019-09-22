package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1212 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String num = br.readLine();
			
			StringBuilder sb = new StringBuilder();
			StringBuilder s = new StringBuilder();
			for(int i=0; i<num.length(); i++) {
				int m = Integer.parseInt(num.substring(i, i+1));
				while(true) {
					sb.append(m%2);
					if(m/2 == 0) {
						if(i != 0 && sb.length()<3) {
							if(sb.length()==1) s.append("00");
							if(sb.length()==2) s.append("0");
						}
						s.append(sb.reverse());
						sb.delete(0, sb.length());
						break;
					}
					m = m/2;
				}
			}
			
			System.out.println(s.toString());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
