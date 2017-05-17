package baek1916;

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
		int start=0,end=0;
		int []dist = new int[a+1];
		List<Node> []arr= new ArrayList[a+1];
		for(int a1=1;a1<=a;a1++){
			arr[a1]=new ArrayList<Node>();
		}
		for(int a1=1;a1<=b;a1++){
			start=sc.nextInt();
			end=sc.nextInt();
			int c=sc.nextInt();
			arr[start].add(new Node(end,c));
		}
		
		start=sc.nextInt();
		end=sc.nextInt();
		Arrays.fill(dist,100000001);
		dist[start]=0;
		PriorityQueue<Node> q = new PriorityQueue<Node>();
		q.offer(new Node(start,dist[start]));
		while(!q.isEmpty()){//경로 구하는 while 문
			int k=q.peek().dif;
			q.poll();
			for(int a1=0;a1<arr[k].size();a1++){
				int k1=arr[k].get(a1).dif;
				if(dist[k1]>dist[k]+arr[k].get(a1).dist){
					dist[k1]=(dist[k]+arr[k].get(a1).dist);
					q.offer(new Node(k1,dist[k1]));
				}
			}
		}
		System.out.println(dist[end]);
		
		
	}

}
class Node implements Comparable<Node>{
	int dif;
	int dist;
	public Node(int dif,int dist){
		this.dif=dif;
		this.dist=dist;
	}
	@Override
	public int compareTo(Node n) {
		// TODO Auto-generated method stub
		return this.dist>n.dist? -1 :1;
	}


}