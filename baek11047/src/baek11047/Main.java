package baek11047;

import java.util.Scanner;

public class Main {
		static int num;
		static int []p;
		static int max = Integer.MAX_VALUE;;
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		num =sc.nextInt();
		int goal = sc.nextInt();
		p = new int[num+1];
		for(int a=1;a<=num;a++){
			p[a]=sc.nextInt();
		}
		for(int a=num/2;a<=num&&p[a]<=goal;a++){
			
			
		}
		
	}
	

}
