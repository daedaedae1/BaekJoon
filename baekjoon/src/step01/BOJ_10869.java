package step01;

// 사칙연산, https://www.acmicpc.net/problem/10869

import java.util.*;

public class BOJ_10869 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt();
		
		System.out.println((a+b)+"\n"+(a-b)+"\n"+
		(a*b)+"\n"+(a/b)+"\n"+(a%b));

	}

}
