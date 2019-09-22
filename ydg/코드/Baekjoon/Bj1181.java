package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Bj1181 {
	
		
	public static void main(String[] args) {
		try {
			//입력
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int cnt = Integer.parseInt(br.readLine());
			String[] str = new String[cnt];
			for(int i=0; i<cnt; i++) str[i]= br.readLine();
			
			Arrays.sort(str, new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					return o1.length() - o2.length();
				}
			});
			
			
			int j, len, len_temp;
			for(int i=0; i<cnt; i++) {
				len = str[i].length();
				for(j=i+1; j<cnt; j++) {
					len_temp = str[j].length();
					if(len != len_temp) break;
				}
				Arrays.sort(str, i, j);
				i=j-1;
			}
			
			System.out.println(str[0]);

			for(int i=1; i<cnt; i++) {
				// 같은 알파벳이면 출력하지않고 다음으로 넘어감
				if(str[i-1].equals(str[i])) continue;
				System.out.println(str[i]);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
