package step05;

// 문자열, https://www.acmicpc.net/problem/9086
// 그냥 문자와 문자를 더하면, 아스키 코드 값을 더한다.

import java.util.*;

public class BOJ_9086 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			String str = sc.next();
			System.out.println(str.charAt(0)+""+str.charAt(str.length()-1));
		}
		
	}

}
