package Line;

import java.util.Scanner;

public class LineTest_1909_6 {
	static String[] map;
	static int max;
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.nextLine();
        
        String[][] m = new String[a][2];
        max = 0;
        for(int i=0; i<a; i++) {
        	m[i] = sc.nextLine().split(" ");
        	max = max > Integer.parseInt(m[i][0]) ? max : Integer.parseInt(m[i][0]) ; 
        }
        
        map = new String[max];
        
	}
	
	public static void one(int w, String sort) {
		if(max == w) {
			
		}else {
			
		}
	}
	
}
