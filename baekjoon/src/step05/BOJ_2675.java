package step05;

// 문자열 반복, https://www.acmicpc.net/problem/2675

import java.util.*;

public class BOJ_2675 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			int r = sc.nextInt();
			String s = sc.next();
			String p = "";
			
			for (int j = 0; j < s.length(); j++) {
				for (int z = 0; z < r; z++) {
					p += s.charAt(j);
				}
			}
			System.out.println(p);
		}

	}

}
