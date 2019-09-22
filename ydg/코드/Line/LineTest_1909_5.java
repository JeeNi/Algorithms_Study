package Line;

import java.util.Scanner;

public class LineTest_1909_5 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] m = new int[a+1][b+1];
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        for(int i=0; i<m.length; i++) {
        	for(int j=0; j<m[i].length; j++) {
        		m[0][j] = 1;
        		m[i][0] = 1;
        	}
        }

        
        if(a<x || b < y) {
        	System.out.println("fail");
        	return;
        }
        
        
        for(int i=1; i<=x; i++) 
        	for(int j=1; j<=y; j++) 
        		m[i][j] = m[i-1][j] + m[i][j-1];
        	
        
        
        System.out.println(x+y);
        System.out.println(m[x][y]);
	}
	
	
}
