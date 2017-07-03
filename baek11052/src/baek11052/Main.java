package baek11052;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num+1];
		for(int a=1;a<=num;a++){
			arr[a]=sc.nextInt();
		}
		
		int dp[] = new int[10001];
		dp[1]=arr[1];
		for(int a=2;a<=num;a++){
			for(int b=1;b<a;b++){
				int k=Math.max(arr[a],dp[a-b]+dp[b]);
				dp[a]=Math.max(k, dp[a]);
			}
		}
		System.out.println(dp[num]);
	}

}
