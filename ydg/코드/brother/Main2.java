package brother;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		try(Scanner s = new Scanner(System.in)){
			int n = s.nextInt();

			int nums[] = new int[n];
	      
			for(int i = 0; i < n; i++){
				int a = s.nextInt();
				int b = s.nextInt();

				//여기부터 작성해 주세요
				nums[i] = a;
				nums[i+1] = b;
				
			}//for
		}//try
	}
}
