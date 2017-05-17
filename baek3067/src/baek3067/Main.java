package baek3067;

import java.util.Scanner;

public class Main {
	static int count;
	static int coins[];
	static int dp[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int exam= sc.nextInt();
		StringBuilder st  = new StringBuilder();
		for(int a=0;a<exam;a++){
			int num=sc.nextInt();
			coins = new int[num];
			for(int a1=0;a1<num;a1++){
				coins[a1]=sc.nextInt();
			}
			int goal = sc.nextInt();
			dp = new int[goal+1];
			dp[0]=1;
			for(int a2=0;a2<num;a2++){
				for(int a3=coins[a2];a3<=goal;a3++){
					dp[a3]+=dp[a3-coins[a2]];
				}
			}
			st.append(dp[goal]);
			
		}
		System.out.println(st);
	}
	

}
