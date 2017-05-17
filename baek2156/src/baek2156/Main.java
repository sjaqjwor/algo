package baek2156;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[10001];
		int dp[] = new int[10001];
		if(num==1){
			System.out.println(sc.nextInt());
		}else{
			for(int a=1;a<=num;a++){
				arr[a]=sc.nextInt();
			}
			dp[1]=arr[1];
			dp[2]=arr[1]+arr[2];
			for(int a=3;a<=num;a++){
				
				dp[a]=Math.max(dp[a-1], Math.max(arr[a-1]+arr[a]+dp[a-3], arr[a]+dp[a-2]));
			}
			Arrays.sort(dp);
			
			System.out.println(dp[dp.length-1]);
		}
		
		
		
	}

}
