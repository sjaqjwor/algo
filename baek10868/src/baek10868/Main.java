package baek10868;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int update= sc.nextInt();
		/*int sum =sc.nextInt();*/
		long tree[] = new long[num*4+1];
		long arr[] = new long[num+1];
		StringBuilder st = new StringBuilder();
		for(int a=1;a<=num;a++){
			arr[a]=sc.nextInt();
		}
		init(tree,arr,1,1,num);
		System.out.println();
		System.out.println(Arrays.toString(tree));
		
		for(int a=1;a<=update;a++){
			long b=sc.nextLong();
			long c=sc.nextLong();
			
			st.append(sum(tree,1,1,num,b,c)).append("\n");
			
		}
		System.out.println(st);
		
		
	}
	static long init(long []tree,long []arr,int node,int start,int end){
		if(start==end){
			return tree[node]=arr[start];
		}
		int mid=(start+end)/2;
		long k=init(tree,arr,node*2,start,mid);
		long p=init(tree,arr,node*2+1,mid+1,end);
		if(k>p){
			return tree[node]=p;
		}else{
			return tree[node]=k;
		}
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
		long k =sum(tree,node*2,start,mid,left,right);
		long p = sum(tree,node*2+1,mid+1,end,left,right);
		if(k>p){
			if(p==0){
				return k;
			}else{
				return p;	
			}
			
		}else{
			if(k==0){
				return p;
			}else{
				return k;
			}
			
		}
	}
	

}
