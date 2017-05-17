package baek1475;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char []k = sc.nextLine().toCharArray();
		int []arr= new int[10];
		for(int a=0;a<k.length;a++){
			arr[k[a]-48]+=1;
		}
		
		int sum=0;
		int max=0;
		for(int a=0;a<=9;a++){
			if(arr[a]>sum&&(a!=6&&a!=9)){
				sum=arr[a];
			}
			if(a==6||a==9){
				max+=arr[a];
			}
		}
		if(max%2==0){
			max=max/2;
		}else{
			max=(max/2)+1;
		}
		if(max>sum){
			System.out.println(max);
		}else{
			System.out.println(sum);
		}
		
	}

}
