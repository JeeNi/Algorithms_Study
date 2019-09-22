package programmers;

import java.util.Arrays;

public class ProSort_1 {
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		int[] answer = new Solution_ProSort_1().solution(array, commands);
		for(int n : answer) System.out.println(n);
	}
}

class Solution_ProSort_1{
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int pos = 0;
        for(int i=0; i<commands.length; i++) {
        	int s = commands[i][0];
        	int e = commands[i][1];
        	int k = commands[i][2];
        	int leng = e-s+1;
        	int[] temp = new int[leng];
        	for(int j=0; j<leng; j++) {
        		if(s<=e) {
        			temp[j] = array[s-1];
        			s++;
        		}
        	}
        	Arrays.sort(temp);
        	answer[pos++] = temp[k-1];
        }//for
        
        return answer;
        
        /*
         int[] answer = new int[commands.length];

         for(int i=0; i<commands.length; i++){
             int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
             Arrays.sort(temp);
             answer[i] = temp[commands[i][2]-1];
         }

         return answer;
         */
    }
}

