package baek11053;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[]= new int[num+1];
		int dp[] = new int[num+1];
		
		for(int a=1;a<=num;a++){
			arr[a]=sc.nextInt();
		}
		for(int a=1;a<=num;a++){
			dp[a]=1;
			for(int a1=1;a1<a;a1++){
				if(arr[a]>arr[a1]&&dp[a1]+1>dp[a]){
					dp[a]=dp[a1]+1;
				}
			}
		}
		Arrays.sort(dp);
		System.out.println(dp[num]);
	}

}
