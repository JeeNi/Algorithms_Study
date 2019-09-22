package programmers;

import java.util.LinkedList;

public class ProSQ_3 {
	public static void main(String[] args) {
		int bridge_length = 100;
		int weight = 100;
		int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};
		System.out.println(new ProSQ_3_Solution().solution(bridge_length, weight, truck_weights));
	}
}
class ProSQ_3_Solution{
    public int solution(int bridge_length, int weight, int[] truck_weights) {
       
    	LinkedList<ProSQ_3_Nums> q = new LinkedList<ProSQ_3_Nums>();
        for(int i=0; i<truck_weights.length; i++)
        	q.add(new ProSQ_3_Nums(0, truck_weights[i]));
        
        LinkedList<ProSQ_3_Nums> bridge = new LinkedList<ProSQ_3_Nums>();
        int time = 0;
        int sumWeight = 0;
        ProSQ_3_Nums first = null;
        
        while( true) {
        	
        	
        	//다리에 추가
        	if(q.size() > 0 && sumWeight+q.getFirst().w <= weight) {
        		first = q.poll();
        		bridge.add(first);
        		sumWeight += first.w;
        	}

        	
        	//1초 증가
        	time++;
        	if(bridge.size() > 0) {
        		for(int i=0; i<bridge.size(); i++) {
        			bridge.get(i).time += 1;
        		}
        	}

        	//다리에서 빠져나갈 트럭 제거
        	if(bridge.size() > 0 && bridge.getFirst().time >= bridge_length) {
        		sumWeight -= bridge.getFirst().w;
        		bridge.removeFirst();
        	}
        
        	if(bridge.size() == 0 && q.size() == 0) {
        		time ++;
        		break;
        	}
        	
        	
        }
        
        return time;
    }
}
class ProSQ_3_Nums{
	int time;
	int w;
	
	public ProSQ_3_Nums(int time, int w) {
		this.time = time;
		this.w = w;
	}
}