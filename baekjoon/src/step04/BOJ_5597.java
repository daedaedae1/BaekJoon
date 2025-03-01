package step04;

// 과제 안 내신 분..?, https://www.acmicpc.net/problem/5597

import java.util.*;

public class BOJ_5597 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean[] arr = new boolean[30];	// 기본값 : false
		
		for (int i = 0; i < 28; i++) {
			int n = sc.nextInt()-1;
			arr[n] = true;
		}
		
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (!arr[i]) {
				System.out.println(i+1);
				count++;
			}
			
			if (count == 2) break;
			
		}
		
	}

}
