package step06;

// 킹, 퀸, 룩, 비숍, 나이트, 폰, https://www.acmicpc.net/problem/3003

import java.util.*;

public class BOJ_3003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {1, 1, 2, 2, 2, 8};
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] -= sc.nextInt();
			
			System.out.print(arr[i] + " ");
		}
		
	}

}
