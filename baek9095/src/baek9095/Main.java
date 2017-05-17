package baek9095;

import java.util.Scanner;

public class Main {
	static int count=0;
	static int k;
	static int sum=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		k=sc.nextInt();
		int num=0;
		int []arr = new int[k+1];
		for(int a=1;a<=k;a++){
			num=sc.nextInt();
			for(int a1=1;a1<=3;a1++){
				solution(0,a1,num);
			}
			arr[a]=count;
			count=0;
			sum=0;
		}
		for(int a1=1;a1<=k;a1++){
			System.out.println(arr[a1]);
		}
		
		
		
	}
	static void solution(int arr,int k,int goal){
		arr=arr+k;
		if(arr>goal){
			return;
		}
		if(arr==goal){
			count++;
			return;
		}
		for(int a=1;a<=3;a++){
			solution(arr,a,goal);
		}
	}
}
