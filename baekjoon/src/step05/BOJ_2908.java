package step05;

// 상수, https://www.acmicpc.net/problem/2908

import java.util.*;

// 상수, https://www.acmicpc.net/problem/2908

public class BOJ_2908 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		int ra = Integer.parseInt(new StringBuilder(a).reverse().toString());
		int rb = Integer.parseInt(new StringBuilder(b).reverse().toString());
		
		System.out.println(Math.max(ra, rb));

	}

}
