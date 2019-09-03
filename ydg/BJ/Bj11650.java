package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj11650 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int cnt = Integer.parseInt(br.readLine());
			compareNum[] c = new compareNum[cnt];
			for(int i=0; i<cnt; i++) {
				String[] arr = br.readLine().split(" ");
				c[i] = new compareNum(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
			}
			Arrays.sort(c);
			
			for(int i=0; i<cnt; i++) {
				System.out.println(c[i].x+" "+c[i].y);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


class compareNum implements Comparable<compareNum>{
	
	public int x;
	public int y;
	
	public compareNum(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(compareNum o) {
		if(this.x == o.x) return this.y - o.y;
		return this.x - o.x;
	}
	
}