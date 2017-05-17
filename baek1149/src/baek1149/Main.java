package baek1149;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int [][] arr;
	static int k1;
	static int arr1[];
	static int max=Integer.MAX_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		k1 = sc.nextInt();
		arr = new int[k1+1][4];
		arr1 = new int[k1];
		int sum=0;
		Arrays.fill(arr1,0);
		for(int a=1;a<=k1;a++){
			for(int a1=1;a1<=3;a1++){
				arr[a][a1]=sc.nextInt();
			}
		}
		for(int a=1;a<=k1;a++){
			so(1,a,0);
		}
		System.out.println(max);
	}
	static void so(int a,int k,int sum){
		if(a==k1+1){
			if(max>sum){
				max=sum;
			}
			return;
		}
		if(k==1){
			sum+=arr[a][k];
			so(a+1,k+1,sum);
			so(a+1,k+2,sum);
		}
		if(k==2){
			sum+=arr[a][k];
			so(a+1,k-1,sum);
			so(a+1,k+1,sum);
		}
		if(k==3){
			sum+=arr[a][k];
			so(a+1,k-1,sum);
			so(a+1,k-2,sum);
		}
	}
}
