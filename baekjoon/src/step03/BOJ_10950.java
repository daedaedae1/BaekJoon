package step03;

// A+B - 3, https://www.acmicpc.net/problem/10950

import java.util.*;

public class BOJ_10950 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			System.out.println(a+b);
		}

	}

}
