package step06;

// 팰린드롬인지 확인하기, https://www.acmicpc.net/problem/10988

import java.util.*;

public class BOJ_10988 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		
		String word = sc.next();
		
		if (word.equals(sb.append(word).reverse().toString())) 
			System.out.println(1);
		else 
			System.out.println(0);
	}

}
