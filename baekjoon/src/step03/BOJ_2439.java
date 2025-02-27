package step03;

// 별 찍기 - 2, https://www.acmicpc.net/problem/2439
// for문 2개에 if문 활용으로도 가능.

import java.util.*;

public class BOJ_2439 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = n-i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
