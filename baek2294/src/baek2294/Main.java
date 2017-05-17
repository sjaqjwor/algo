package baek2294;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int []p;
	static int num;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int goal = sc.nextInt();
		p = new int[101];
		/*int [][]dp = new int[101][100001];*/
		int dp[] = new int[100001];
		Arrays.fill(dp, 100001);
		for(int k=1;k<=num;k++){
			p[k]=sc.nextInt();
		}
		for(int a=1;a<=num;a++){
			dp[p[a]]=1;
			for(int a1=p[a];a1<=goal;a1++){
				dp[a1]=Math.min(dp[a1], dp[a1-p[a]]+1);
			}
		}
		/*
		for(int a=1;a<=num;a++){
			for(int a1=1;a1<=goal;a1++){
				if(a1%p[a]==0){
					dp[a][a1]=a 1/p[a];
				}else if(a1<p[a]){
					dp[a][a1]=dp[a-1][a1];
				}else{
					if(dp[a][a1-p[a]]==0){
						dp[a][a1]=dp[a-1][a1];
					}else{
						if(p[a]==1){
							dp[a][a1]=dp[a][a1-p[a]]+1;
						}else{
						dp[a][a1]=Math.min(dp[a][a1-p[a]]+1, dp[a-1][a1-p[a]]+1);
							}
						}
				}
			}
		}
		*/
		
			if(dp[goal]==100001){
				System.out.println(-1);
			}else{
				System.out.println(dp[goal]);
			}
			
			
			
			
		}
		
			
	}
	


