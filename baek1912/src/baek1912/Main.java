package baek1912;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num];
		for(int a=0;a<num;a++){
			arr[a]=sc.nextInt();
		}
		int dp[] = new int[num];
		int max=0;
		int sum=0;
		for(int a=0;a<num;a++){
			max=arr[a];
			sum=arr[a];
			for(int a1=a-1;a1>=0;a1--){
				sum+=arr[a1];
				if(max<sum){
					max=sum;
				}
			}
			dp[a]=max;
		}
		Arrays.sort(dp);
		System.out.println(dp[num-1]);

	}
	

}
