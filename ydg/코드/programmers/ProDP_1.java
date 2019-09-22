package programmers;

public class ProDP_1 {
	public static void main(String[] args) {
		int N = 5;
		int number = 12;
		System.out.println(new Solution_ProDP_1().solution(N, number));
	}
}
class Solution_ProDP_1{
	static int answer =-1;	
    
    public int solution(int N, int number) {
        
        dfs(N, number, 0,0);
        return answer;
    }
    static void dfs(int N, int number , int cnt, int prev) {
        int temp_N = N;
        if (cnt > 8) {
            answer = -1;
            return;
        }
        
        if (number == prev ) {
            if (answer == -1 || answer > cnt)
                answer = cnt;
            return;
        }
        
        for (int i = 0; i < 8-cnt; i++) {
            dfs(N, number, cnt+i+1, prev-temp_N);
            dfs(N, number, cnt+i+1, prev+temp_N);
            dfs(N, number, cnt+i+1, prev*temp_N);
            dfs(N, number, cnt+i+1, prev/temp_N);
            
            temp_N =  increaseNumber(temp_N, N);
        }
    }
    static int increaseNumber(int value, int N) {
        return value * 10 + N;
    }
}
	 