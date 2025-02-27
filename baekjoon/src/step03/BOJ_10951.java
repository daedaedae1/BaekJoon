package step03;

// A+B - 4, https://www.acmicpc.net/problem/10951
// 백준에선 답으로 인정. 이클립스에선 입력 없이 엔터쳐도 반복됨.

import java.util.*;

public class BOJ_10951 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextInt()) {
			int a = sc.nextInt(), b = sc.nextInt();
			System.out.println(a+b);			
		}
		
	}

}
