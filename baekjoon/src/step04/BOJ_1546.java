package step04;

// 평균, https://www.acmicpc.net/problem/1546

import java.util.*;

public class BOJ_1546 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		float[] arr = new float[n];
		
		arr[0] = sc.nextInt();
		float max = arr[0];
		
		for (int i = 1; i < n; i++) {
			arr[i] = sc.nextFloat();
			max = Math.max(max, arr[i]);
		}
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i]/max*100;
		}
		
		float result = 0;
		
		for (float a : arr) {
			result += a;
		}
		
		System.out.println(result/n);

	}

}
