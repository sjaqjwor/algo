package baek1786;

import java.util.Scanner;

public class Main {
	static int le[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[] str = sc.nextLine().toCharArray();
		char[] p  = sc.nextLine().toCharArray();
		le=new int[p.length];
		int j=0;
		int k=0;
		int count=0;
		process(p);
		StringBuffer st = new StringBuffer();	
		while(j<str.length){
			while(k>0 && str[j]!=p[k]){
				k = le[k-1];
			}
			if(str[j]==p[k]){
				k++;
			}
			if(k==p.length){
				k=le[k-1];
				count++;
				st.append(j-p.length+2).append(" ");
			}
			j++;
			
		}
		System.out.println(count);
		System.out.println(st);
		
		
		
	}
	static void process(char []p){
		for(int a=1;a<p.length;a++){
			int num=le[a-1];
			while(num>0&&p[a]!=p[num]){
				num=le[num-1];
			}if(p[a]==p[num]){
				le[a]=le[a-1]+1;
			}else{
				le[a]=0;
			}
		}
	}
}

