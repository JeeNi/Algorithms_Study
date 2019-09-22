package programmers;

public class ProDP_2 {
	public static void main(String[] args) {
		System.out.println(new Solution_ProDP_2().solution(6));
	}
}
class Solution_ProDP_2{
    public long solution(int N) {
        long answer = 0;
        
        long[] result = new long[N];
        result = pib(N);
        //System.out.println(result[N-1]);
        //System.out.println(result[N-2]);
        answer = (result[N-1]+result[N-2])*2 + result[N-1]*2;
        
        return answer;
    }
    public long[] pib(int N) {
    	long[] pib = new long[N];
    	pib[0] = 1;
    	pib[1] = 1;
    	for(int i=2; i<N; i++)
    		pib[i] = pib[i-1] + pib[i-2];
    	return pib;
    }
	
}