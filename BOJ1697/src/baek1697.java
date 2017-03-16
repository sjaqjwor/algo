import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class baek1697 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int start=sc.nextInt();
			int goal=sc.nextInt();
			boolean arr[] = new boolean[100000];
			int dist[] = new int[100000];
			Arrays.fill(arr, false);
			Arrays.fill(dist, 0);
			Queue<Integer> st = new LinkedList<Integer>();
			st.add(start);
			arr[start]=true;
			int count=0;
			while(!st.isEmpty()){
				int k =st.remove();
				if(k-1>=0){
					if(arr[k-1]==false){
						arr[k-1]=true;
						st.add(k-1);
						dist[k-1]=dist[k]+1;
					}
				}if(k+1<100000){
					if(arr[k+1]==false){
						arr[k+1]=true;
						st.add(k+1);
						dist[k+1]=dist[k]+1;
					}
				}if(k*2<100000){
					if(arr[k*2]==false){
						arr[k*2]=true;
						st.add(k*2);
						dist[k*2]=dist[k]+1;
					}
				}
			}
			
		System.out.println(dist[goal]);
		
			
			
			
	}

}
