package programmers;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ProHeap_2 {
	public static void main(String[] args) {
		int stock = 4;
		int[] dates = {4, 10 ,15};
		int[] supplies = {20, 5 ,10};
		int k =30;
		System.out.println(new Solution_ProHeap_2().solution(stock, dates, supplies, k));
	}
}
class Solution_ProHeap_2{
    public int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;
        
        /*
         * 문제풀이방법
         * - 밀가루를 리필하는 시점은 하루씩 지나면서 재고가 0이되면 리필해준다. --------------------> (1)
         * - 리필해주기 위해 우선수위 큐에 가장 큰 값부터 나오게 저장한다 --------------------------> (2)
         * - 또한 큐에 저장하는 시기는 하루씩 지나면서 해당 일이 dates 배열의 일과 같을 때 채워준다. -----> (3)
         */
        
        
        Queue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());   //(2)
        
		int pos = 0;
        for (int i = 0; i < k; i++) {
            if(pos < dates.length && i == dates[pos])    //(3)
                q.add(supplies[pos++]);
 
            if(stock == 0) {       //(1)
                stock += q.poll();
                answer++;
            }
            stock -= 1;        //하루가 흘러 -1
        }
        
        
        return answer;
    }
	
}
