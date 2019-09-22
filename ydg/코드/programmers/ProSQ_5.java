package programmers;

import java.util.LinkedList;

public class ProSQ_5 {
	public static void main(String[] args) {
		String arrangement = "()(((()())(())()))(())";
		System.out.println(new ProSQ_5_Solution().solution(arrangement));
	}
}
class ProSQ_5_Solution{
    public int solution(String arrangement) {
        int answer = 0;
		
        LinkedList<Integer> stick = new LinkedList<Integer>();
        
        for(int i=0; i<arrangement.length()-1; i++) {
        	char c1 = arrangement.charAt(i);
        	char c2 = arrangement.charAt(i+1);
        	
        	if(c1 == '(' && c2 == ')') {
        		if(stick.size() > 0 ) {
        			for(int j=0; j<stick.size(); j++) { 
        				int t = stick.remove(j);
        				t+=1;
        				stick.add(j, t);
        			}
        		}
        		i++;
        	}else{
	        	if(c1 == '(') stick.add(0);
	        	else {
	        		answer+=stick.getLast()+1;
	        		stick.removeLast();
	        	}
        	}
        }//for
        
        answer += stick.removeFirst()+1;
        
        return answer;
    }
}