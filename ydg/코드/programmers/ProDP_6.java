package programmers;

public class ProDP_6 {
	public static void main(String[] args) {
		int[] money = {1,2,3,1};
		System.out.println(new Solution_ProDP_6().solution(money));
	}
}
class Solution_ProDP_6{
	public int solution(int[] money) {
        int length = money.length;
        int[] dp =new int[length-1];
        int[] dp2= new int[length];
        
        dp[0]=money[0];
        dp[1]=money[0];
        dp2[0]=0;
        dp2[1]=money[1];
        //(지금 현재 내가 도둑질하고 있는 집 + 전전 집)과, (지금 도둑질 하지 않고, 바로 전집) 을 비교하여 큰 값
        for(int i=2;i<length-1;i++){
            dp[i]=Math.max(dp[i-2]+money[i],dp[i-1]);
        }
        for(int i=2;i<length;i++){
            dp2[i]=Math.max(dp2[i-2]+money[i],dp2[i-1]);
        }
        
        return Math.max(dp[length-2],dp2[length-1]);
    }
}