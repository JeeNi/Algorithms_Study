package programmers;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class ProHeap_3 {
	public static void main(String[] args) {
		int[][] jobs = {{0,3}, {3,5},{8,6}};
		System.out.println(new Solution_ProHeap_3().solution(jobs));
	}
}
class Solution_ProHeap_3{
	
	
	public int solution(int[][] jobs) {
		int answer = 0;
		
		PriorityQueue<Disk> q = new PriorityQueue<Disk>();
		for(int i=0; i<jobs.length; i++)
			q.add(new Disk(jobs[i][0], jobs[i][1]));
		/*
		while(!q.isEmpty()) {
			Disk tmpD = q.poll();
			System.out.println(tmpD.start+"/"+tmpD.job);
		}
		*/
		
		ArrayList<Disk> l = new ArrayList<>();
		for(int i=0; i<jobs.length; i++) {
			l.add(q.poll());
		}
		
		int t = 0;
		int s = 0;
		/*
		while(q.size() > 0) {
			for(int i=0; i<q.size(); i++) {
				int tmp = q.peek().start;
				if(t >= tmp) {
					Disk dTmp = q.poll();
					t += dTmp.job;
					s += t - dTmp.start;
					break;
				}
				if(i == q.size()-1) t++;
			}
		}
		 */
		while (l.size()>0) {
            for (int i = 0; i < l.size(); i++) {
                //시작시간이 현재 시간보다 이전이라면 시작 가능
                if (t>=l.get(i).start) {
                    t+=l.get(i).job;
                    s+=t-l.get(i).start;
                    l.remove(i);
                    break;
                }
                //시작시간이 현재 시간보다 이전인 것이 없다면 시간 1초 증가
                if (i == l.size()-1) t++;
            }
        }
		
		answer = s/jobs.length;
		return answer;
	}
}

class Disk implements Comparable<Disk>{
	int start;
	int job;
	
	public Disk(int start, int job) {
		this.start = start;
		this.job = job;
	}

	@Override
	public int compareTo(Disk o) {
		if(this.job == o.job) return this.start - o.start;
		return this.job - o.job;
	}
	
}