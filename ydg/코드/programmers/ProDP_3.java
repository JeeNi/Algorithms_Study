package programmers;

public class ProDP_3 {
	public static void main(String[] args) {
		int[][] triangle = {{7}, {3,8}, {8,1, 0}, {2,7,4,4}, {4,5, 2, 6, 5}};
		System.out.println(new Solution_ProDP_3().solution(triangle));
	}
}
class Solution_ProDP_3{
	
	int[][] result ;
	
	public int solution(int[][] triangle) {
	
		int n = triangle.length;
		int m = triangle[n-1].length;
		result = new int[n][m];
		for(int i=0; i<triangle.length; i++)
			for(int j=0; j<triangle[i].length; j++)
				result[i][j] = -1;
		//topBottom(triangle, 0, 0);
		//result = triangle; buttomUp(triangle);
        
        
        return result[0][0];
    }
	
	public void buttomUp(int[][] triangle) {
		
		for(int i=triangle.length-2; i >= 0; i--) 
			for(int j=0; j<triangle[i].length; j++) 
				result[i][j] = Math.max(result[i+1][j], result[i+1][j+1]) + triangle[i][j];
			
	}
	
	
	public int topBottom(int[][] triangle, int l, int c) {
		
		if(l == triangle.length-1) return triangle[l][c];
		else if(result[l][c] != -1) return result[l][c];
		
		result[l][c] = Math.max(topBottom(triangle, l+1, c), topBottom(triangle, l+1, c+1)) + triangle[l][c];
		return result[l][c];
	}
}
