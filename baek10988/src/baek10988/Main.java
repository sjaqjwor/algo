package baek10988;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String k = sc.nextLine();
		int max=0;
		
		for(int a=0;a<k.length()/2;a++){
			if(k.charAt(a)!=k.charAt(k.length()-(a+1))){
				max=1;
				break;
			}
		}
		
		if(max==1){
			System.out.println(0);
		}else{
			System.out.println(1);
		}
		
	}

}
