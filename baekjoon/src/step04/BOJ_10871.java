package step04;

// X보다 작은 수, https://www.acmicpc.net/problem/10871

import java.util.*;

public class BOJ_10871 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), x = sc.nextInt();
		
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int a : arr) {
			if ( x > a ) {
				System.out.print(a + " ");
			}
		}
		
//		for (int i = 0; i < n; i++) {
//			int a = sc.nextInt();
//			if ( x > a ) {
//				System.out.print(a + " ");
//			}
//		}

	}

}
