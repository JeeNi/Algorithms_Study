package programmers;

import java.util.LinkedList;

public class ProSQ_4 {
	public static void main(String[] args) {
		int[] progresses = {40, 93, 30, 55, 60, 65};
		int[] speeds = {60, 1, 30, 5 , 10, 7};
		int[] tmp = new ProSQ_4_Solution().solution(progresses, speeds);
		for(int n : tmp) System.out.print(n+" ");
	}
}
class ProSQ_4_Solution{
    public int[] solution(int[] progresses, int[] speeds) {
        
        LinkedList<Integer> q = new LinkedList<Integer>();
        for(int i=0; i<progresses.length; i++) {
        	int tmp = (100 - progresses[i] ) / speeds[i];
        	if((100 - progresses[i] ) % speeds[i] != 0) tmp +=1;
        	q.add(tmp);
        }
        
        LinkedList<Integer> result = new LinkedList<Integer>();
        while(q.size()>0) {
        	int tmp = q.pop();
        	int cnt = 1 ;
        	while( q.size()>0) {
	    		 if(tmp >= q.getFirst()) {
	    			q.removeFirst();
	    			cnt++;
	    		 }else break;
        		
        	}//while
        	result.add(cnt);
        }//while
        
        
        int[] answer = new int[result.size()];
        for(int i=0; i<result.size(); i++)	
        	answer[i] = result.get(i);
        
        return answer;
    }
}
