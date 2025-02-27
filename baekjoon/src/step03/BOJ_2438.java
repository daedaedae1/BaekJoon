package step03;

// 별 찍기 - 1, https://www.acmicpc.net/problem/2438

import java.util.*;

public class BOJ_2438 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				
				System.out.print("*");
				
			}
			System.out.println();
		}

	}

}
