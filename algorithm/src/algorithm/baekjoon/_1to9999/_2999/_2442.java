package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2442 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=N; i++) {
			
			for(int j=N-i; j>0; j--) {
				sb.append(" ");
			}
			
			for(int j=0; j<2*i-1; j++) {
				sb.append("*");
			}
			
			sb.append("\n");
		}

		System.out.println(sb);
	}

}