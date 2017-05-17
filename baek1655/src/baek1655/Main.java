package baek1655;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> min = new PriorityQueue<>();
		PriorityQueue<Integer> max = new PriorityQueue<>(1,Collections.reverseOrder());
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num+1];
		int count;
		StringBuilder str = new StringBuilder();
		int mid = 0;
		for(int a=1;a<=num;a++){
			count=sc.nextInt();
			if(a==1)mid=count;
			else if(mid>count){
				max.offer(count);
			}else{
				min.offer(count);
			}
			if(a%2!=0){
				if(min.size()==max.size()){
					arr[a]=mid;
				}
				else if(min.size()<max.size()){
					min.offer(mid);
					mid=max.poll();
					arr[a]=mid;
				}else {
					max.offer(mid);
					mid=min.poll();
					arr[a]=mid;
				}
			
			}else{
				if(max.size()>min.size()){
					arr[a]=max.peek();
				}else{
					arr[a]=mid;
				}
			}
			
		}
		for(int a=1;a<arr.length;a++){
			System.out.println(arr[a]);
		}
		
	}

}
