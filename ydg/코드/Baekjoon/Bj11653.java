package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj11653 {
	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine());
			
			for(int i=2; i*i<=num; i++) {
				while(num%i == 0) {
					System.out.println(i);
					num /= i;
				}
			}
			if(num >1) System.out.println(num);
			
			
			
			/*
			int pos = 2; //소수 
			boolean flag ; // 소수 판별을 한 번만하고, pos가 증가되면 false로 바꿔 while 탈출 
			label : while(true) {
				//소수이면 소인수분해 시작
				if(IsPrime(pos)) {
					flag = true; //소수니까 true -> while 시작
					while(flag) {
						if(num%pos ==0) { //나머지가 0이면 출력 후 num 감소
							System.out.println(pos);
							num = num/pos;
						}else { //아니면 pos를 증가시키고 flag를 false로 만들어 while 탈출
							pos++;
							flag = false;
						}
					}//while
					//끝나면 멈추기
					if(num == 1) break label;
					
				}else pos++;
			}//while
			*/
			
			
			
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
	
	static boolean IsPrime(int x) {
		for(int i=2; i*i<=x; i++)
			if(x%i ==0) return false;
		return true;
	}
	
}
