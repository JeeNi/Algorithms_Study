package brother;

import java.util.Arrays;
import java.util.Scanner;


public class Main3 {
	public static void main(String[] args) {
		try(Scanner s = new Scanner(System.in)){
			int n = s.nextInt(); //인원수
			int d = s.nextInt(); // 방향 1 or 0
			int k = s.nextInt(); // 탈락자 위치
			int j = s.nextInt(); // 증가
			
			//여기부터 작성해 주세요
			int start = 1;
			int end = 0 ;
			int cnt = 0 ;
			boolean[] flags = new boolean[n];
			Arrays.fill(flags, true);
				if(d == 1) {
					while(true) {
						if(flags[start]) {
							if(cnt == 0) {
								flags[start] = false;
								System.out.println("start=="+start);
								end++;
								k+=j;
								cnt = k;
							}else {
								start = (start == n-1)? 0: start+1;
								cnt--;
							}
						}else {
							start = (start == n-1)? 0: start+1;
							cnt--;
						}
						if(end == n-1)
							break;
					}//while
					
					for(int i=0; i<flags.length; i++)
						if(flags[i]==true) 
							System.out.println(i+1);

					System.out.println("***");
					for(boolean flag : flags) {
						System.out.print(flag+" ");
					}
					System.out.println();
					System.out.println("***");
					
					
				}else {
					
				}
			}
		
	}
}
