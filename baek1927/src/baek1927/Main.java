package baek1927;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int []arr = new int[1000003];
		int count=0;
		for(int a=0;a<num;a++){
			int k =sc.nextInt();
			if(k==0&&count==0){
				System.out.println(0);
			}else if(k==0){
				System.out.println(arr[1]);
				int k1=1;
				arr[1]=arr[count];
				count--;
				while(arr[k1*2]<=arr[k1]&&count>k1*2||arr[k1*2+1]<=arr[k1]&&count>k1*2+1){
					if(arr[k1*2]<=arr[k1]){
						int temp=arr[k1*2];
						arr[k1*2]=arr[k1];
						arr[k1]=temp;
						k1=k1*2;
					}
					else if(arr[k1*2+1]<=arr[k1]){
						int temp=arr[k1*2+1];
						arr[k1*2+1]=arr[k1];
						arr[k1]=temp;
						k1=k1*2+1;
					}
				}
			}else{
					if(count==0){
						arr[1]=k;
						count++;
					}else{
						arr[count+1]=k;
						int n=count+1;
						count++;
						while(arr[n/2]>arr[n]){
							Integer temp=arr[n];
							arr[n]=arr[n/2];
							arr[n/2]=temp;
							n=n/2;
						}
					
				}
			}
		}
		/*
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		PriorityQueue<Integer> arr = new PriorityQueue<>();
		for (int i = 0; i < N; i++) {
			int input = sc.nextInt();
			if (input == 0) {
				Integer result = arr.poll();
				if(result == null) result = 0;
				System.out.println(result);
				continue;
			}
			arr.add(input);
		}
		*/
		
	}
}
