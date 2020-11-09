//알고리즘 과제 - 피보나치 수(동적 프로그래밍) -> n번째까지의 피보나치 수 구하기

import java.util.Scanner;
public class Fibonacci {

	private static int[] dp;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수를 입력하세요: ");
		int num = sc.nextInt();
		dp = new int[num + 1];
		
		System.out.print(num + "번째까지의 피보나치 수(Bottom-Up): ");
		for (int i = 1; i <= num; i++) {
			System.out.print(fibo1(i) + " ");
		}
		
		System.out.print("\n\n" + num + "번째까지의 피보나치 수(Top-Down): ");
		for (int i = 1; i <= num; i++) {
			System.out.print(fibo2(i) + " ");
		}
		
		sc.close();

	}
	
	// Bottom-Up 방식
	public static int fibo1(int n) {
		dp[1] = 1;
		dp[2] = 1;
		
		for (int i = 3; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];
		
	}
	
	// Top-Down 방식
	public static int fibo2(int n) {
		if (dp[n] != 0) {
			return dp[n];
		} else {
			if (n == 1 || n == 2) {
				dp[n] = 1;
			} else {
				dp[n] = fibo2(n - 1) + fibo2(n - 2);
			}
			return dp[n];
		}
		
	}

}
