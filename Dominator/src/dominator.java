import java.util.Arrays;
import java.util.HashMap;

public class dominator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []A = new int[]{5,5,5,3,3,3,3,3};
		System.out.println(solution(A));
	}
	static int solution(int []A){
		stack st = new stack();
		int []arr = new int[A.length];
		int count=0;
		int pre=0;
		for(int a=0;a<A.length;a++){
			if(st.em()){
				st.push(arr,A[a]);
				count++;
			}else if(st.pop(arr)==A[a]){
				st.push(arr, A[a]);
				count++;
			}else{
				count--;
				if(count==0){
					st.top=0;
					st.push(arr, A[a]);
					count++;
				}
			}
		}
		count=0;
		for(int a=0;a<A.length;a++){
			if(st.pop(arr)==A[a]){
				count++;
				pre=a;
			}
		}
		if(count<=A.length/2){
			return -1;
		}else{
			return pre;
		}
	}

}
class stack{
	int top;
	public void push(int []arr,int k){
		arr[top]=k;
		top++;
	}
	public int pop(int []arr){
		return arr[top-1];
	}
	public boolean em(){
		if(top==0){
			return true;
		}else{
			return false;
		}
	}
}

