package step02;

// 사분면 고르기, https://www.acmicpc.net/problem/14681

import java.util.*;

public class BOJ_14681 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(), y = sc.nextInt();
		
		if (x > 0) {
			if (y > 0)
				System.out.println(1);
			else
				System.out.println(4);
		}
		else {
			if (y > 0)
				System.out.println(2);
			else
				System.out.println(3);
		}

	}

}
