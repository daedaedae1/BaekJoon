package step03;

// A+B - 8, https://www.acmicpc.net/problem/11022

import java.io.*;
import java.util.*;

public class BOJ_11022 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= t; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			bw.write("Case #"+ i + ": " + a + " + " + b + " = " + (a+b) + "\n");
			
		}
		
		bw.flush();
		br.close();
		bw.close();
		
	}

}
