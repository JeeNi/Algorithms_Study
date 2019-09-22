package brother;

//Please don't change class name 'Main'
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try(Scanner s = new Scanner(System.in))
		{
			int x1 = s.nextInt();
			int y1 = s.nextInt();
			int x2 = s.nextInt();
			int y2 = s.nextInt();
			int x3 = s.nextInt();
			int y3 = s.nextInt();
			int x4 = s.nextInt();
			int y4 = s.nextInt();
			int x5 = s.nextInt();
			int y5 = s.nextInt();
			int x6 = s.nextInt();
			int y6 = s.nextInt();

			//여기부터 작성해 주세요
			int[][] area = new int[10000][10000];
			for(int i=x3; i<x4; i++) {
				for(int j=y3; j<y4; j++) {
					area[i][j] = 2;
				}
			}

			for(int i=x5; i<x6; i++) {
				for(int j=y5; j<y6; j++) {
					if(area[i][j] == 0)area[i][j] = 3;
				}
			}

			int result =0;
			for(int i=x1; i<x2; i++) {
				for(int j=y1; j<y2; j++) {
					if(area[i][j] ==0) result+=1;
				}
			}
			System.out.println(result);
		}
	}
}
