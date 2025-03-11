package step04;

// 바구니 뒤집기, https://www.acmicpc.net/problem/10811
// 과거의 답도 한번 보기.

import java.util.*;

public class BOJ_10811 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), m = sc.nextInt();
		
		int[] arr = new int[n];
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			arr[i] = i+1;
		}
		
		for (int a = 0; a < m; a++) {
			int index = 0;
			int i = sc.nextInt(), j = sc.nextInt();
			
			for (int b = i; b <= j; b++ ) {
				list.add(arr[b-1]);
			}
			
			Collections.reverse(list);
			
			for (int b = i; b <= j; b++ ) {
				arr[b-1] = list.get(index++);
			}
			
			list.clear();

		}
		
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}
