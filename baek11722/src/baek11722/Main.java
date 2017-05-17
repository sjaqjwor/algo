package baek11722;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	static int num;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 num  = sc.nextInt();
		int []arr= new int[num+1];
		int dp[] = new int[num+1];
		for(int a=1;a<=num;a++){
			arr[a]=sc.nextInt();
		}
		
		for(int a=1;a<=num;a++){
			dp[a]=1;
			for(int b=1;b<a;b++){
				if(arr[a]<arr[b] && dp[a]<dp[b]+1){
					dp[a]=dp[b]+1;
				}
			}
			
		}
		int max=0;
		for(int a=1;a<=num;a++){
			if(dp[a]>max){
				max=dp[a];
			}
		}
		System.out.println(max);
	}
	
	
}
