package step05;

// 아스키 코드, https://www.acmicpc.net/problem/11654
// char형을 int형변환하면, 아스키 코드 값이 나온다. 

import java.util.*;

public class BOJ_11654 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		System.out.println((int)str.charAt(0));
		
	}

}
