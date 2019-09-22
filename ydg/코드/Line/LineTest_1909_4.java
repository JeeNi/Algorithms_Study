package Line;

import java.util.Scanner;

public class LineTest_1909_4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] m = new int[cnt];
        for(int i=0; i<cnt; i++)
        	m[i] = sc.nextInt();
        
        int min = 20001;
        int max = 0;
        for(int i=0; i<m.length; i++) {
        	if(m[i] == 1) continue;
        	
        	int l = left(i, m);
        	int r = right(i, m);
        	min = l >  r ? r : l;
        	max = max > min ? max : min ;
        }
        
        System.out.println(max);
		
	}
	
	public static int left(int p, int[] m) {
		for(int i = p; i >= 0; i--) {
			if(m[i] == 1) {
				return p-i;
			}
		}
		return 20001;
	}
	public static int right(int p, int[] m) {
		for(int i = p; i < m.length; i++) {
			if(m[i] == 1) {
				return i-p;
			}
		}
		return 20001;	
	}
}