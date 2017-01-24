import java.util.Scanner;

public class back1932 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][]arr = new int[n][n];
		int [][]d = new int[n][n];
		int num=0;
		
		for(int a=0;a<n;a++){
			for(int b=0;b<=a;b++){
				arr[a][b]=sc.nextInt();
			}
		}
		for(int a=0;a<1;a++){
			for(int b=0;b<n;b++){
				d[a][b]=arr[a][b];
			}
		}
	
		for(int a=1;a<arr.length;a++){
			for(int b=0;b<a+1;b++){
				if(b==0){
					d[a][b]=d[a-1][b]+arr[a][b];
				}else if(b<a+1){
					d[a][b]=Math.max(d[a-1][b-1], d[a-1][b])+arr[a][b];
				}else{
					d[a][b]=arr[a][b]+d[a-1][b-1];
				}
			}
		}
		for(int a=0;a<arr.length;a++){
			if(d[arr.length-1][a]>num){
				num=d[arr.length-1][a];
			}
		}
		System.out.println(num);
	}
	

}
