package step05;

// 알파벳 찾기, https://www.acmicpc.net/problem/10809
// 문제 잘 읽기, 다른 내 답도 보기

import java.util.*;

public class BOJ_10809 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		int[] arr = new int[26];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < s.length(); j++) {
				if ( i+97 == s.charAt(j) )
					if ( arr[i] == -1 )
						arr[i] = j;
			}
		}
		
		for (int result : arr) {
			System.out.print(result + " ");
		}

	}

}
