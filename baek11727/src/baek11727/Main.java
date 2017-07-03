package baek11727;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int dp[] = new int[10001];
		dp[1] = 1;
		if(num>1){
			dp[2] = 3;
			for (int a = 3; a <= num; a++) {
				if (a % 2 != 0) {
					dp[a] = ((dp[a - 1] * 2) - 1)%10007;
				} else {
					dp[a] = ((dp[a - 1] * 2) + 1)%10007;
				}
				
			}
		}
		System.out.println(dp[num] % 10007);
	}

}
