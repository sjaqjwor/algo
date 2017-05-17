package baek10610;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[] num= sc.nextLine().toCharArray();
		StringBuilder st = new StringBuilder();
		Arrays.sort(num);
		for(int a=num.length-1;a>=0;a--){
			st.append(num[a]);
		}
		BigInteger val = new BigInteger(st.toString());
		BigInteger k = new BigInteger("30");
		BigInteger k1 = new BigInteger("0");
		if(val.remainder(k).equals(k1)){
			System.out.println(val);
		}else{
			System.out.println(-1);
		}
		
	
		
	}

}
