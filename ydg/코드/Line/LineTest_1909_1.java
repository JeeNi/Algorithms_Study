package Line;

import java.util.LinkedList;
import java.util.Scanner;

public class LineTest_1909_1 {
	public static void main(String[] args) {
		new LineTest_1909_1_Solution().solution();
	}
}
class LineTest_1909_1_Solution{
	public static void solution() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        LinkedList<Integer> q = new LinkedList<>();
        int[] c = new int[b];
        for(int i=0; i<a; i++) {
        	int t = sc.nextInt();
        	if(i < b) c[i] = t;
        	else q.add(t);
        	
        }
        
        int time = 0;
        while(true) {

        	if(q.size() == 0 && check(c))
        		break;
        	
        	//시간증가
        	time++;
        	
        	//consumer 작업시간 감소
        	for(int i=0; i<c.length; i++) {
        		if(c[i] != 0 )c[i] -= 1;
        		//0인것 확인해서 다음꺼 채워 넣기
        		if(c[i] == 0) {
        			if(q.size()>0) c[i] = q.poll();
        		}
        	}
        	
        }
        
        System.out.println(time);
        
    }
	
	public static boolean check(int[] c) {
		
		for(int i=0; i<c.length; i++)
			if(c[i] != 0) return false;
		
		return true;
	}
}