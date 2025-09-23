package step05;

// 단어의 개수, https://www.acmicpc.net/problem/1152

import java.util.*;

public class BOJ_1152 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		char[] word = str.toCharArray();
		int count = 0;
		
		int i = 0;
		
		if ((int)word[0] != 32) {
			count++;
			i = 1;
		}

		for (; i < word.length; i++) {
			if (word.length-1 == i && (int)word[i] == 32) {
				break;
			} 
			else if ((int)word[i] == 32) count++;
		}
		
		System.out.println(count);
	}
	
	
}
