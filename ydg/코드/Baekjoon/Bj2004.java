package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2004 {
	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] st = br.readLine().split(" ");
			long n = Long.parseLong(st[0]);
			long m = Long.parseLong(st[1]);
			int two = 0;
			int five = 0;

			for ( long i=2; i<=n; i*=2) {
				two += n/i;
			}
			for ( long i=2; i<=n-m; i*=2) {
				two -= (n-m)/i;
			}
			for ( long i=2; i<=m; i*=2) {
				two -= m/i;
			}
			for ( long i=5; i<=n; i*=5) {
				five += n/i;
			}
			for ( long i=5; i<=n-m; i*=5) {
				five -= (n-m)/i;
			}
			for ( long i=5; i<=m; i*=5) {
				five -= m/i;
			}

			System.out.println(Math.min(two, five));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
