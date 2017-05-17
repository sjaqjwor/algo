package baek2293;

import java.util.Scanner;


	public class Main {
		static int []p;
		static int num;
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();
			int goal = sc.nextInt();
			p = new int[num+1];
			int []dp = new int[goal+1];
			for(int k=1;k<=num;k++){
				p[k]=sc.nextInt();
			}
			for(int k=1;k<=num;k++){
				for(int k1=0;k1<=goal;k1++){
					if(k1==0){
						dp[k1]=1;
					}
					if(k1!=0&&k1-p[k]>=0){
						dp[k1]=dp[k1]+dp[k1-p[k]];
					}
				}
			}
			System.out.println(dp[goal]);
			
		}
}


