package Line;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

public class LineTest_1909_2 {
	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int t = Integer.parseInt(br.readLine());
			Arrays.sort(nums);
			LinkedList<Integer> q = new LinkedList<>();
			for(int i=0; i<nums.length; i++) q.add(nums[i]);
			
			String result = "";
			int n = 1; for(int i=1; i<nums.length; i++) n*=i;
			int a = t/n;
			int b = t%n;
			while(q.size() > 0) {
				
				if(b == 0) {
					result += q.get(a-1).toString();
					q.remove(a-1);
					while(q.size()>0) result += q.removeLast().toString();
				}else {
					result += q.get(a).toString();
					q.remove(a);
					n = 1; for(int i=1; i<q.size(); i++) n*=i;
					a = b/n;
					b = b%n;
				}
				
			}
			System.out.println(result);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
