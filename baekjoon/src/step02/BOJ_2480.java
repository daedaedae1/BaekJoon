package step02;

// 주사위 세개, https://www.acmicpc.net/problem/2480

import java.util.*;

public class BOJ_2480 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		
		if ( a == b && a == c ) {
			System.out.print(10000 + a * 1000);
		}
		else if ( a != b && a != c && b != c) {
			int max = Math.max(a, b);
			max = Math.max(max, c);
			
			System.out.print(max * 100);
		}
		else {
			if ( a == b ) 
				System.out.print(1000 + a * 100);
			else if ( a == c ) 
				System.out.print(1000 + a * 100);
			else
				System.out.print(1000 + b * 100);		
			}
		
	}

}
