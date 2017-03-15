import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class BAEK11403 {
	static int arr[][];
	static boolean b[];
	static int a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		a= sc.nextInt();
		arr = new int[a+1][a+1];
		for(int b=1;b<=a;b++){
			for(int a1=1;a1<=a;a1++){
				arr[b][a1]=sc.nextInt();
			}
		}
		b = new boolean[a+1];
		for(int b1=1;b1<=a;b1++){
			Arrays.fill(b, false);
			dfs(b1,b1);
			
		}
		for(int b=1;b<=a;b++){
			for(int a1=1;a1<=a;a1++){
				System.out.print(arr[b][a1]+" ");
			}
			System.out.println();
		}
		
		
			
	}
	static void dfs(int start,int v){
		for(int b1=1;b1<=a;b1++){
			if(b[b1]!=true&&arr[v][b1]==1){
				arr[start][b1]=1;
				b[b1]=true;
				dfs(start,b1);
			}
		}
	}

}


