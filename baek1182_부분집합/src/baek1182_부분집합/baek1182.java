package baek1182_부분집합;

import java.util.Scanner;

public class baek1182 {
	static int count=0;
	static int sum=0;
	static int arr[];
	static int N;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int S = sc.nextInt();
		arr = new int[N+1];
		for(int a=1;a<=N;a++){
			arr[a]=sc.nextInt();
		}
		sum(1,sum,S);
		System.out.println(count);
		
		
	}
	static void sum(int a,int k,int goal){
		if(a==N+1) return;
		if(sum+arr[a]==goal){
			count++;
		}
		sum(a+1,sum,goal);
		sum+=arr[a];
		System.out.println(sum);
		sum(a+1,sum,goal);
		sum-=arr[a];
		
		
	}

}
