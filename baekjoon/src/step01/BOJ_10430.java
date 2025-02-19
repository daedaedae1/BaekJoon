package step01;

// 나머지, https://www.acmicpc.net/problem/10430

import java.util.*;

public class BOJ_10430 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		
		System.out.println((a+b)%c+"\n"+((a%c)+(b%c))%c+"\n"+(a*b)%c
				+"\n"+((a%c)*(b%c))%c);

	}

}
