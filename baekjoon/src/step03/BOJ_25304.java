package step03;

// 영수증, https://www.acmicpc.net/problem/25304

import java.util.*;

public class BOJ_25304 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int price = sc.nextInt();
		
		int n = sc.nextInt();
		
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			
			int a = sc.nextInt(), b = sc.nextInt();
			
			sum += a*b;
			
		}
		
		System.out.println((price == sum) ? "Yes" : "No");  
		
	}

}
