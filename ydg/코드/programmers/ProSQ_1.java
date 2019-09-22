package programmers;

import java.util.LinkedList;

public class ProSQ_1 {
	public static void main(String[] args) {
		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location = 0;
		System.out.println(new ProSQ_1_Solution().solution(priorities, location));
	}
}
class ProSQ_1_Solution{
    public int solution(int[] priorities, int location) {

    	LinkedList<Nums> q = new LinkedList<Nums>();
        for(int i=0; i<priorities.length; i++)
        	q.add(new Nums(i, priorities[i]));
        
       
        int answer = 1;
        Nums firstNums = null;
        while(q.size()>1) {
        	firstNums = q.getFirst();
        	for(int i=1; i<q.size(); i++) {
        		if(firstNums.n < q.get(i).n) {
        			q.addLast(firstNums);
        			q.removeFirst();
        			break;
        		}
        		if(i == q.size()-1) {
        			if(firstNums.pos == location) return answer;
        			q.removeFirst();
        			answer++;
        		}
        	}//for
        }
        
        return answer;
    }
    
   
}

class Nums{
	int pos;
	int n;
	public Nums(int pos, int n) {
		this.pos = pos;
		this.n = n;
	}
}