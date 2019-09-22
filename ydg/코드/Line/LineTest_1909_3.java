package Line;

import java.util.LinkedList;
import java.util.Scanner;

public class LineTest_1909_3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        LinkedList<LineTest_1909_3_Nums> q = new LinkedList<>();
        for(int i=0; i<a; i++) 
        	q.add(new LineTest_1909_3_Nums(sc.nextInt(), sc.nextInt()));
        
        int cnt = 0;
        int time = 0;
        while(q.size()>0) {
        	LineTest_1909_3_Nums tmp = q.poll();
        	cnt ++;
        	time = tmp.e;
        	for(int i=0; i<q.size();) {
        		
        		if(time <= q.get(i).e){
        			time = q.get(i).e;
        			q.remove(i);
        		}else {
        			i++;
        		}
        	}//for
        }//while
        
        System.out.println(cnt);
	}
}

class LineTest_1909_3_Nums implements Comparable<LineTest_1909_3_Nums>{
	int s;
	int e;
	public LineTest_1909_3_Nums(int s, int e) {
		this.s = s;
		this.e = e;
		
	}
	@Override
	public int compareTo(LineTest_1909_3_Nums o) {
		return this.s- o.s;
	}
}