package baek1753;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class baek1753 {
	static int V,E,Start,u,v,w,max=3000001;
	static List<Node>[] arr;
	static int[] dist;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			 V = sc.nextInt();
			 E = sc.nextInt();
			 Start = sc.nextInt();
			 max = 3000001;
			arr = new ArrayList[V+1];
			dist = new int[V+1];
			for(int a=1;a<=V;a++){
				arr[a] = new ArrayList<Node>();
			}
			for(int a=0;a<E;a++){
				 u = sc.nextInt();
				 v = sc.nextInt();
				 w = sc.nextInt();
				arr[u].add(new Node(v,w));
			}
			for(int a=1;a<=V;a++){
				dist[a]=max;
			}
			PriorityQueue<Node> q = new PriorityQueue<Node>();
			dist[Start]=0;
			q.offer(new Node(Start,dist[Start]));
			while(!q.isEmpty()){
				u = q.peek().dif;
				q.poll();
				for(int a=0;a<arr[u].size();a++){
					int k1 = arr[u].get(a).dif;
					if(dist[k1]>dist[u]+arr[u].get(a).dist){
						dist[k1]=dist[u]+arr[u].get(a).dist;
						q.offer(new Node(k1,dist[k1]));
					}
				}
			}
			for(int i=1;i<=V;i++){
				if(dist[i]==max){
					System.out.println("INF");
				}else{
					System.out.println(dist[i]);
				}
			}
	}

}
class Node implements Comparable<Node>{
	int dist;
	int dif;
	public Node(int dif,int height){
		this.dist=height;
		this.dif=dif;
	}
	
	public int compareTo(Node n) {
		// TODO Auto-generated method stub
		return dist <= n.dist ? -1 : 1;
	}
}
