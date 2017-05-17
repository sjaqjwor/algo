package baek11726;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int []arr= new int[num+1];
		arr[1]=1;
		arr[2]=2;
		for(int a=3;a<=num;a++){
			arr[a]=arr[a-1]+arr[a-2];
			arr[a]=arr[a]%10007;
		}
		System.out.println(arr[num]);
	}

}
