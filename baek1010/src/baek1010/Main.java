package baek1010;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder st  = new StringBuilder();
		int num = sc.nextInt();
		for(int a2=1;a2<=num;a2++){
		int k=sc.nextInt();
		int k1=sc.nextInt();
		int arr[][] = new int[32][32];
		for(int a=1;a<=31;a++){
			for(int a1=1;a1<=31;a1++){
				arr[a][a1]=1;
			}
		}
		
		for(int a=1;a<=k1;a++){
			for(int a1=1;a1<=k;a1++){
				if(a==a1){
					arr[a][a1]=1;
				}
				if(a1==1){
					arr[a][a1]=a/a1;
				}else{
					arr[a][a1]=arr[a-1][a1-1]+arr[a-1][a1];
				}
			}
		}
			st.append(arr[k1][k]).append("\n");
		
		}
		System.out.println(st);
	}
}
