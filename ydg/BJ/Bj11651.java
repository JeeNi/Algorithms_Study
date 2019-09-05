package Baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Bj11651 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		CompareNums[] nums = new CompareNums[cnt];
		for(int i=0; i<cnt; i++) {
			nums[i] = new CompareNums(sc.nextInt(), sc.nextInt());
		}
		
		
		Arrays.sort(nums, CompareNums.compareNums);
		
		for(int i=0; i<cnt; i++) {
			System.out.println(nums[i].a + " " + nums[i].b);
		}
		
	}
	
	
}

class CompareNums{
	public int a;
	public int b;
	
	public CompareNums(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public static Comparator<CompareNums> compareNums = new Comparator<CompareNums>() {
		@Override
		public int compare(CompareNums o1, CompareNums o2) {
			if(o1.b == o2.b) return o1.a - o2.a;
			else return o1.b - o2.b;
		}
	};
}
