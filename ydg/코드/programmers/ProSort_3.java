package programmers;

import java.util.Arrays;

public class ProSort_3 {
	public static void main(String[] args) {
		int[] citations = {3,0,6,1,5};
		System.out.println(new Solution_ProSort_3().solution(citations));
	}
}
class Solution_ProSort_3 {
	int answer = 0;
    public int solution(int[] citations) {
        
        Arrays.sort(citations);
        int pos = 0;
        while(pos <= citations.length) {
        	for(int i=0; i<citations.length; i++) {
        		int n = citations[i];
        		if(pos <= n) {
        			int cnt = citations.length - i;
        			if(pos == cnt) {
        				answer = pos;
        				break;
        			}
        		}//if
        	}//for
        	pos ++;
        }
        
        return answer;
    }
}