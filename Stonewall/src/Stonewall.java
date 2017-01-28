import java.util.Arrays;

public class Stonewall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = new int[]{8, 8, 5, 7, 9, 8, 7, 4, 8};
		System.out.println(solution(arr));
	}
	static int solution(int []H){
		int []arr = new int[H.length];
		stack st = new stack();
		int count=0;
		for(int a=0;a<H.length;a++){
			if(st.em()){
				st.push(arr, H[a]);
			}else if(st.pop(arr)>H[a]){
				while(!st.em()){
					if(st.pop(arr)>H[a]){
						st.top--;
						count++;
					}else if(st.pop(arr)==H[a]){
						st.top--;
					}
					else{
						break;
					}
				}
				st.push(arr, H[a]);
			}else if(st.pop(arr)<H[a]){
				st.push(arr, H[a]);
			}
		}
		System.out.println(st.top);
		System.out.println(count);
		return count=count+st.top;
	}
}
class stack{
	int top=0;
	public void push(int []arr,int a){
		arr[top]=a;
		top++;
		
	}
	public int pop(int []arr){
		return arr[top-1];
	}
	public boolean em(){
		if(top ==0){
			return true;
		}
		else{
			return false;
		}
	}
}
