package step03;

// 빠른 A+B, https://www.acmicpc.net/problem/15552
// scanner의 시간초과를 해결하기 위한 빠른 방법.

import java.io.*;
import java.util.*;

public class BOJ_15552 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		
		while ( t > 0 ) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			bw.write(a+b + "\n");
			
			t--;
			
		}
		
		bw.flush();
		br.close();
		bw.close();
		
	}

}
