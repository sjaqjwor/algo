package baekjoon1766;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int []arr = new int[a+1];

		List<Integer> []degree = new List[a+1];
		for(int a1=1;a1<=a;a1++){
			degree[a1]= new ArrayList<>();
		}
		Arrays.fill(arr, 0);
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int a1=0;a1<b;a1++){
			int k=sc.nextInt();
			int k1=sc.nextInt();
			degree[k].add(k1);
			arr[k1]=arr[k1]+1;
		}
		for(int a1=1;a1<=a;a1++){
			if(arr[a1]==0){
				pq.offer(a1);
			}
		}
		StringBuilder str = new StringBuilder();
		while(!pq.isEmpty()){
			int k = pq.poll();
			for(int a1 : degree[k]) {
                arr[a1]=arr[a1]-1;
                if (arr[a1] <= 0) {
                    pq.offer(a1);
                }
            }
            str.append(k).append(" ");
		}
		System.out.println(str);
		
	}
}
