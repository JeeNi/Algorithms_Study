package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class ProSort_2 {
	public static void main(String[] args) {
		// int[] numbers = {3, 30, 34, 5, 9, 99};
		int[] numbers = { 12, 121 };
		//int[] numbers = {21, 212, 0, 0, 0};

		System.out.println(new Solution_ProSort_2().solution(numbers));
	}
}

class Solution_ProSort_2 {
	public String solution(int[] numbers) {
		String[] arr = new String[numbers.length];
		for (int i = 0; i < numbers.length; i++)
			arr[i] = String.valueOf(numbers[i]);

		//Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return (o2+o1).compareTo(o1+o2);
			}
		});

		if (arr[0].equals("0"))
			return "0";

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++)
			sb.append(arr[i]);

		return sb.toString();
	}
}