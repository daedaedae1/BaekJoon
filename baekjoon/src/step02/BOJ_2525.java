package step02;

// 오븐 시계, https://www.acmicpc.net/problem/2525
// 3항 연산자 대신, % 24로 깔끔하게 표현 가능.

import java.util.*;

public class BOJ_2525 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		
		int sum = a*60 + b + c;
		
		int h = (sum / 60) >= 24? sum / 60 - 24 : sum / 60;
		int m = sum % 60;
		
		System.out.println(h + " " + m);
		
	}
}
