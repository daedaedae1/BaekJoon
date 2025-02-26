package step03;

// 코딩은 체육과목 입니다. https://www.acmicpc.net/problem/25314

import java.util.*;

public class BOJ_25314 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String str = "";
		
		for (int i = 0; i < N/4; i++) {
			str += "long ";
		}
		
		System.out.println(str+"int");

	}

}
