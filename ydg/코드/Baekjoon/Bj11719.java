package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj11719 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			while(str != null) {
				System.out.println(str);
				str = br.readLine();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
