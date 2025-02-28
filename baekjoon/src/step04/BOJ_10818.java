package step04;

// 최소, 최대, https://www.acmicpc.net/problem/10818

import java.util.*;

public class BOJ_10818 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0], min = arr[0];
		
		for (int a : arr) {
			if (max < a) max = a;
			if (min > a) min = a;
		}
		
		System.out.println(min + " " + max);

	}

}
