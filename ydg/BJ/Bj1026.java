package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Bj1026 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int cnt = sc.nextInt();
			int[] A = new int[cnt];
			int[] B = new int[cnt];
			
			for(int i=0; i<cnt; i++) A[i] = sc.nextInt();
			for(int i=0; i<cnt; i++) B[i] = sc.nextInt();
			
			Arrays.sort(A);
			Arrays.sort(B);
			
			int sum = 0;
			for(int i=0; i<cnt; i++) {
				sum += A[i] * B[cnt-1-i];
			}
			System.out.println(sum);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
