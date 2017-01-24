import java.util.Scanner;

public class backjun1149 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count=0;
		int min=Integer.MAX_VALUE;
		int [][]arr = new int[num][3];
		for(int a=0;a<num;a++){
			for(int b=0;b<3;b++){
				arr[a][b]=sc.nextInt();
			}
		}
		int [][]c = new int[num][num];
		for(int a=0;a<num;a++){
			c[0][a]=arr[0][a];
		}
		
		for(int a=1;a<num;a++){
			c[a][0]=Math.min(c[a-1][1], c[a-1][2])+arr[a][0];
			c[a][1]=Math.min(c[a-1][0], c[a-1][2])+arr[a][1];
			c[a][2]=Math.min(c[a-1][0], c[a-1][1])+arr[a][2];
			
		}
		min=Math.min(c[num-1][0],c[num-1][1]);
		min=Math.min(min,c[num-1][1]);
		System.out.println(min);
		
		

	}
}
