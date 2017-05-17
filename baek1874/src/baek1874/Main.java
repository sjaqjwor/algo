package baek1874;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int []arr= new int[num];
		int k=0;
		int k1=1;
		int count=0;
		for(int a=0;a<num;a++){
			arr[a]=sc.nextInt();
		}
		Stack<Integer> st = new Stack<>();
		StringBuilder s = new StringBuilder();
		while(k<num&&k1<=num){
			if(st.isEmpty()){
				s.append("+").append("\n");
				st.push(k1);
				k1++;
			}
			else if(st.peek()!=arr[k]){
				s.append("+").append("\n");
				st.push(k1);
				k1++;
			}
			else if(st.peek()==arr[k]){
				s.append("-").append("\n");
				count++;
				st.pop();
				k++;
			}
		}
		if(k<num){
			for(int a=k;a<num;a++){
				if(arr[a]==st.peek()){
					s.append("-").append("\n");
					count++;
					st.pop();
				}else{
					break;
				}
			}
		}
		if(count==num){
			System.out.println(s);
		}else{
			System.out.println("NO");
		}
		
	}

}
