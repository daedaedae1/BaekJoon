package step03;

// 구구단, https://www.acmicpc.net/problem/2739

import java.util.*;

public class BOJ_2739 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(N + " * " + i + " = " + N*i);
		}

	}

}
