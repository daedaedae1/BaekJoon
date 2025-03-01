package step04;

// 공 넣기, https://www.acmicpc.net/problem/10810

import java.util.*;

public class BOJ_10810 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] n = new int[sc.nextInt()];	// 기본값이 0이 있는 듯.
		int m = sc.nextInt();		
			
		for(int a = 0; a < m; a++) {
			
			int i = sc.nextInt(), j = sc.nextInt(), k = sc.nextInt();
			
			for (int b = i-1; b <= j-1; b++) {
				n[b] = k;
			}
			
		}
		
		for (int a : n) {
			System.out.print(a + " ");
		}
	}
		
}
