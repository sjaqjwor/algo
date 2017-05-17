package baek6359;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int num;
			int k= sc.nextInt();
			int count=0;
			int temp[]  =new int[k];
			boolean chek[];
			for(int b=0;b<k;b++){
				num=sc.nextInt();
				chek= new boolean[num+1];
				Arrays.fill(chek, false);
			for(int a=2;a<=num;a++){
				for(int a1=a;a1<=num;){
					if(chek[a1]==true){
						chek[a1]=false;
						a1=a1+a;
					}else{
						chek[a1]=true;
						a1=a1+a;
					}
					 
					
				}
			}
			for(int a=1;a<=num;a++){
				if(chek[a]==false){
					count++;
				}
			}
			 temp[b]=count;
			 count=0;
			}
			
			for(int b=0;b<k;b++){
				System.out.println(temp[b]);
			}
	}

}
