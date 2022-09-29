package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11722 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		// 5
		// 10 30 10 20 10
		int[] dp = new int[N];
		for(int i=0; i<N; i++) {
			
			dp[i] = 1;
			
			for(int j=0; j<i; j++) {
				
				if(arr[i] < arr[j] && dp[i] < dp[j] + 1 ) {
					dp[i] = dp[j] + 1;
				}
			}
		}
		
		int result = dp[0];
		for(int i=1; i<N; i++) {
			if(result < dp[i]) {
				result = dp[i];
			}
		}
		
		System.out.println(result);
	}

}
