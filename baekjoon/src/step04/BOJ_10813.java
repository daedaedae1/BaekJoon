package step04;

// 공 바꾸기, https://www.acmicpc.net/problem/10813

import java.util.*;

public class BOJ_10813 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), m = sc.nextInt();
		
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}	
		
		for (int a = 0; a < m; a++) {
			
			int i = sc.nextInt()-1, j = sc.nextInt()-1;
			
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			
		}
		
		for (int answer : arr) {
			System.out.print(answer + " ");
		}
		
	}

}
