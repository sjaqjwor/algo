package baekjoon1987_¾ËÆÄºª;

import java.util.Scanner;

public class Main {
	static char arr[][];
	static int count=0;
	static int max=0;
	static String str="";
	static int k1=0;
	static int S,E;
	static boolean check[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		S=sc.nextInt();
		E=sc.nextInt();
		arr=new char[S][E];
		for(int a=0;a<S;a++){
			String st= sc.next();
			for(int b=0;b<E;b++){
				arr[a][b]=st.charAt(b);
			}
		}
		check = new boolean[92];
		alpa(0,0);
		System.out.println(max);
		
		 
	}
	static void alpa(int a,int b){
		if(a==S||b==E||a<0||b<0){
			return;
		}
		
		if(!check[arr[a][b]]){
			check[arr[a][b]]=true;
			count++;
			System.out.println(arr[a][b]);
		}else{
			return;
		}
		if(count>max)max=count;
		alpa(a+1,b);
		alpa(a,b+1);
		alpa(a-1,b);
		alpa(a,b-1);
		count--;
		check[arr[a][b]]=false;
		
		
	}

}
