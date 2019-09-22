package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1373 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String num = br.readLine();
			
			if(num.length()%3 == 1) {
				num = "00"+num;
			}else if(num.length()%3 == 2) {
				num = "0"+num;
			}
			
			int sum = 0;
			StringBuilder result= new StringBuilder();
			for(int i =0; i<num.length(); i=i+3) {
				sum+=((int)num.charAt(i)-48) * 4;
				sum+=((int)num.charAt(i+1)-48) * 2;
				sum+=((int)num.charAt(i+2)-48) ;
				result.append(sum);
				sum = 0;
			}
			
			System.out.println(result.toString());
			
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
}
