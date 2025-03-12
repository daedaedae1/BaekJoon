package step05;

// 숫자의 합, https://www.acmicpc.net/problem/11720
// 48 = '0'

import java.util.*;

public class BOJ_11720 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String str = sc.next();
		
		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum += str.charAt(i)-48;
		}
		
		System.out.println(sum);

	}

}
