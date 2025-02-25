package step02;

// 알람 시계, https://www.acmicpc.net/problem/2884

import java.util.*;

public class BOJ_2884 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt(), m = sc.nextInt();
		
		if ( m < 45 ) {
			m += 60 - 45;
			
			if ( h == 0 )
				h = 23;
			else
				h -= 1;
		}
		else {
			m -= 45;
		}
		
		System.out.println(h + " " + m);

	}

}
