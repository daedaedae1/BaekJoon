package step05;

// 다이얼, https://www.acmicpc.net/problem/5622

import java.util.*;

public class BOJ_5622 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char arr[] = sc.next().toCharArray();
		int time = 0;
		
		for (int i = 0; i < arr.length; i++) {
			int num = (int)arr[i]-64;
			if (num < 4) time += 3;
			else if (num < 7) time += 4;
			else if (num < 10) time += 5;
			else if (num < 13) time += 6;
			else if (num < 16) time += 7;
			else if (num < 20) time += 8;
			else if (num < 23) time += 9;
			else if (num < 27) time += 10;
		}
		System.out.println(time);
		
	}
		
}

