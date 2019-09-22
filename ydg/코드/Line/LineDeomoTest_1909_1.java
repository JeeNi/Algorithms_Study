package Line;

import java.util.Arrays;
import java.util.Comparator;

public class LineDeomoTest_1909_1 {
	public static void main(String[] args) {
		int[][] v  = {{1,4}, {3,4}, {3,10}};
		//int[][] v  = {{1,1}, {2,2}, {1,2}};
		int[] tmp = new LineDeomoTest_1909_1_Solution().solution(v);
		System.out.println(tmp[0]+" "+ tmp[1]);
	}
}
class LineDeomoTest_1909_1_Solution {
    public int[] solution(int[][] v) {
        int[] answer = new int[2];
        
        //sort
        Arrays.sort(v, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0])
					return o1[1]-o2[1];
				else return o1[0]-o2[0];
			}
		});
        
        //x
        if(v[0][0] == v[1][0]) 
        	answer[0] = v[2][0];
        else answer[0] = v[0][0];
        
        //y
        if(v[0][1] == v[1][1]) 
        	answer[1] = v[2][1];
        else answer[1] = v[0][1];
        
        
        return answer;
    }
}
class LineDeomoTest_1909_1_compare implements Comparable<Integer>{

	@Override
	public int compareTo(Integer o) {
		
		return 0;
	}
	
}