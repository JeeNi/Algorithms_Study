package Line;

import java.util.Scanner;

public class LineDeomoTest_1909_2 {
	public static void main(String[] args) {
		new LineDeomoTest_1909_2_Solution().solution();
	}
}
class LineDeomoTest_1909_2_Solution {
	 public static void solution() {
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        
	        for(int i=0; i<b; i++) {
	        	for(int j=0; j<a; j++)
	        		System.out.print("*");
        		System.out.println();
	        }

	    }
}