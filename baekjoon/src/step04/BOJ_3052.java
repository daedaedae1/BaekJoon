package step04;

// 나머지, https://www.acmicpc.net/problem/3052
// 과거의 답 참고하기 ( 다른 풀이 방식 )

import java.util.*;

public class BOJ_3052 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		for (int i = 0; i < 10; i++) {
			
			int num = sc.nextInt();
			
			arr[i] = num%42;
			
		}

		boolean flag;
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			flag = true;
			
			for (int j = i+1; j < arr.length; j++) {
				if ( arr[i] == arr[j] ) {
					flag = false;
					break;
				}
			}
			
			if ( flag ) count++;
			
		}
		
		System.out.println(count);
		
	}

}
