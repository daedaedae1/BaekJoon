package step04;

// 최댓값, https://www.acmicpc.net/problem/2562

import java.util.*;

public class BOJ_2562 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		
		int flag = 1;
		
		arr[0] = sc.nextInt();
		
		int max = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			
			arr[i] = sc.nextInt();
			
			if ( max < arr[i] ) {
				max = arr[i];
				flag = i+1;
			}
		}
		
		System.out.println(max + "\n" + flag);

	}

}
