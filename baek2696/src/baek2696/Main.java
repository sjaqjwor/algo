package baek2696;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int []arr = new int[a+1];
		int []ar1;
		int count=1;
		String []str1 = new String[a+1];
		String st;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int b=1;b<=a;b++){
			StringBuilder str = new StringBuilder();
			int k = sc.nextInt();
			arr[b]=(k+1)/2;//중앙값 갯수
			for(int c=1;c<=k;c++){
				int k1= sc.nextInt();
				pq.offer(k1);
				if(c%2!=0){//홀수 번째
					ar1=new int[c+1];//우선 순위큐에서 뺀값을 다시 우선순위 큐에 넣기 위해서
					for(int c1=1;c1<=c;c1++){
						int k2 = pq.poll();
						if(c1==(c+1)/2){//홀수 일때만 str에 추가
							str.append(k2).append(" ");
						}
						ar1[c1]=k2;
					}
					for(int c2=1;c2<ar1.length;c2++){
						pq.offer(ar1[c2]);//뺀값을 다시 넣기
					}
				}
				}
				str1[b]=str.toString();
				pq.clear();//우선순위큐 초기화
			}
			
		for(int b=1;b<=a;b++){
			System.out.println(arr[b]);
			System.out.println(str1[b]);
		}
		
	}

}
