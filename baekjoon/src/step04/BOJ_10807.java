package step04;

// 개수 세기, https://www.acmicpc.net/problem/10807

import java.util.*;

public class BOJ_10807 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] n = new int[sc.nextInt()];
		
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
		}
		
		int v = sc.nextInt();
		
		int count = 0;
		
		for (int a : n) {
			if ( a == v ) {
				count++;
			}
		}
		
		System.out.println(count);

	}

}
