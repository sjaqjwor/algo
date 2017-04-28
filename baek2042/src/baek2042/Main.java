package baek2042;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int update= sc.nextInt();
		int sum =sc.nextInt();
		long tree[] = new long[num*4+1];
		long arr[] = new long[num+1];
		StringBuilder st = new StringBuilder();
		for(int a=1;a<=num;a++){
			arr[a]=sc.nextInt();
		}
		init(tree,arr,1,1,num);
		
		for(int a=1;a<=sum+update;a++){
			long b=sc.nextLong();
			long c=sc.nextLong();
			long d=sc.nextLong();
			
			if(b==1){
					long diff = d - arr[(int) c];
					update(tree,1,1,num,c,diff);
					arr[(int)c]=d;
			}
			if(b==2){
				
				st.append(sum(tree,1,1,num,c,d)).append("\n");
			}
		}
		System.out.println(st);

		
		
	}
	static long init(long []tree,long []arr,int node,int start,int end){
		if(start==end){
			return tree[node]=arr[start];
		}
		int mid=(start+end)/2;
		return tree[node]=init(tree,arr,node*2,start,mid)+init(tree,arr,node*2+1,mid+1,end);
	}
	static void update(long []tree,int node,int start,int end,long index,long diff){
		if(!(start<=index&&index<=end)){
			return;
		}
		tree[node]+=diff;
		if(start!=end){
			int mid=(start+end)/2;
			update(tree,node*2,start,mid,index,diff);
			update(tree,node*2+1,start,mid,index,diff);
		}
	}
	static long sum(long []tree,int node,int start,int end,long left,long right){
		if(end<left||start>right){
			return 0;
		}
		if(left<=start&&end<=right){
			return tree[node];
		}
		int mid = (start+end)/2;
		return sum(tree,node*2,start,mid,left,right)+sum(tree,node*2+1,mid+1,end,left,right);
	}
	

}
