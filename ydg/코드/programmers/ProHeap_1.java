package programmers;

import java.util.PriorityQueue;
import java.util.Queue;

public class ProHeap_1 {
	public static void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int k = 7;
		System.out.println(new Solution_ProHeap_1().solution(scoville, k));
	}
	
}
/*
 * 우선순위 큐
 * - 가장 가중치가 낮은 순서로 poll, peak하는 자료구조
 * - 데이터를 넣을 때 Min Heap으로 정렬
 */
class Solution_ProHeap_1{
	public int solution(int[] scoville, int K) {
        int answer = -1;
        int cnt = 0;
        int s1=0, s2=0;
        Queue<Integer> q = new PriorityQueue<>(scoville.length);
        for(int s : scoville) q.offer(s);
        
        while(q.size()>1) {
        	if(q.peek() >= K) {
        		answer = cnt;
        		break;
        	}
        	s1 = q.poll();
        	s2 = q.poll();
        	q.offer(s1+s2*2);
        	cnt++;
        }
        if(q.poll() >= K) answer = cnt;
        
        
        return answer;
    }
}
