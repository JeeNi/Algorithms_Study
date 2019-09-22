package programmers;

import java.util.Stack;

public class ProSQ_2 {
	public static void main(String[] args) {
		int[] heights = {1,5,3,6,7,6,5};
		int[] tmp = new ProSQ_2_Solution().solution(heights);
		for(int n : tmp) System.out.print(n+" ");
	}
}
class ProSQ_2_Solution{
    public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        
        Stack<ProSQ_2_Nums> s = new Stack<ProSQ_2_Nums>();
        for(int i=0; i<heights.length; i++)
        	s.add(new ProSQ_2_Nums(i, heights[i]));
        
        ProSQ_2_Nums firstNums = null;
        while(s.size() > 0) {
        	firstNums = s.pop();
        	for(int i=s.size()-1; i>=0; i--) {
        		if(firstNums.n < s.get(i).n) {
        			answer[firstNums.pos] = s.get(i).pos+1;
        			break;
        		}//if
        	}//for
        }//while
        
        
        return answer;
    }	
}
class ProSQ_2_Nums{
	int pos;
	int n;
	public ProSQ_2_Nums(int pos, int n) {
		this.pos = pos;
		this.n = n;
	}
}
