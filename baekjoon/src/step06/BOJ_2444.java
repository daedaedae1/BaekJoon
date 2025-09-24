package step06;

// 별 찍기 - 7, https://www.acmicpc.net/problem/2444

import java.util.*;

public class BOJ_2444 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		
		for (int i = 1; i <= (n*2)-1; i++) {
			
			if (i <= n) {
				for (int j = 1; j <= n-i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= (i*2)-1; j++) {
					System.out.print("*");
				}
			}
			else {
				for (int j = i-n; j >= 1; j--) {
					System.out.print(" ");
				}
				for (int j = 3; j <= (temp*2)-1; j++) {
					System.out.print("*");
				}
				temp--;
			}
			System.out.println("");
		}
		

	}

}
