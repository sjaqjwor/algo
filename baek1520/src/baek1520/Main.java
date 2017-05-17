package baek1520;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
	static int [][]k;
	static int [][]k2;
	static int count=0;
	static int a1;
	static int b1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		a1= sc.nextInt();
		b1= sc.nextInt();
		
		k=new int[a1][b1];
		k2=new int[a1][b1];
		for(int a=0;a<a1;a++){
			for(int b=0;b<b1;b++){
				k[a][b]=sc.nextInt();
			}
			 Arrays.fill(k2[a], -1);
		}
		low(a1-1,b1-1);
		System.out.println(k2[a1-1][b1-1]);
		
	}
	static int low(int a2,int b2){
		int [][]dir = {{1,0},{-1,0},{0,1},{0,-1}};
		if(a2==0&&b2==0){
			k2[a2][b2]=1;
		}
		  if(k2[a2][b2]==-1){
		         k2[a2][b2] = 0;
		for(int a=0;a<4;a++){
			int x =a2+ dir[a][0];
			int y =b2+ dir[a][1];
			if((x>=0)&&(y>=0)&&((x<a1)&&(y<b1))&&(k[a2][b2]<k[x][y])){
				k2[a2][b2]+=low(x,y);
			}
			
		
		}
		  }
		return k2[a2][b2];
	}
}
