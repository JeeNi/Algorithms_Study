package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj6588 {
	
	public static boolean IsPrime(int x) {
		boolean flag = true;
		for(int i=2; i*i<=x; i++) {
			if(x%i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	
	public static void main(String[] args) {
		try {
			//입력
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine());
			while(num != 0) {
				for(int i=3; i<=num; i++) {
					if(i %2 == 1 && IsPrime(i)) {
						int num2 = num - i;
						if(IsPrime(num2)) {
							System.out.println(num + " = " + i + " + " + num2);
							break;
						}
					}
					if(i == num) System.out.println("Goldbach's conjecture is wrong.");
				}
				num = Integer.parseInt(br.readLine());
			}
			
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
}
