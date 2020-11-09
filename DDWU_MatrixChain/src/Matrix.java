//알고리즘 과제 - 행렬 곱셈 순서 문제(동적 프로그래밍)

import java.util.Scanner;
public class Matrix {

	private static int[][] c;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수를 입력하세요: ");
		int N = sc.nextInt();
		int[][] m = new int[N][N];
		
		System.out.println(N + "*" + N + "행렬의 값을 입력하세요.");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				m[i][j] = sc.nextInt();
			}
		}
		
		
		
		sc.close();

	}
	

}
