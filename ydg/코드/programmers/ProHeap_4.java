package programmers;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ProHeap_4 {
	public static void main(String[] args) {
		//String[] operations = { "I 16", "D 1" };
		String[] operations = { "I 7", "I 5", "I -5", "D -1" };
		int[] result = new Solution_ProHeap_4().solution(operations);
		for (int r : result)
			System.out.println(r);
	}
}

class Solution_ProHeap_4 {
	public int[] solution(String[] operations) {
		int[] answer = new int[2];

		PriorityQueue<Integer> up = new PriorityQueue<Integer>();
		PriorityQueue<Integer> down = new PriorityQueue<Integer>(Comparator.reverseOrder());

		for (int i = 0; i < operations.length; i++) {
			String[] str = operations[i].split(" ");

			if (str[0].equals("I")) {
				up.add(Integer.parseInt(str[1]));
				down.add(Integer.parseInt(str[1]));
			}

			if (str[0].equals("D")) {
				if (up.size() > 0) {
					if (str[1].equals("1")) {
						int tmp = down.peek();
						down.remove(tmp);
						up.remove(tmp);
					} else {
						int tmp = up.peek();
						down.remove(tmp);
						up.remove(tmp);

					}
				}
			} // if
		} // for

		int max=0, min = 0;
		if (up.size() > 0) {
			max = down.poll();
			min = up.poll();
		}
		answer[0] = max;
		answer[1] = min;

		return answer;

	}

}