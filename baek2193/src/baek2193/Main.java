package baek2193;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		long []arr = new long[k+1];
		if(k==1){
			arr[1]=1;
		}else{
		arr[1]=1;
		arr[2]=1;
		for(int a=3;a<=k;a++){
			arr[a]=arr[a-2]+arr[a-1];
			}
		}
		System.out.println(arr[k]);
		
	}

}
