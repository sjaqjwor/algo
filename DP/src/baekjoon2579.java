import java.util.Scanner;

public class baekjoon2579 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		int []sum = new int[test+1];
		int []point = new int[test+1];
		for(int a=1;a<test+1;a++){
			point[a]=sc.nextInt();
		}
		for(int a=1;a<test+1;a++){
			int temp,temp1,max=0;
			if(a<3){
				sum[a]=sum[a-1]+point[a];
			}
			else{
				temp=sum[a-3]+point[a-1]+point[a];
				temp1=sum[a-2]+point[a];
				max=Math.max(temp,temp1);
				sum[a]=max;
			}
		}
		System.out.println(sum[test]);
	}
	
	
}
