
public class brackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = ")(";
		System.out.println(main(a));

	}

	static int main(String s) {
		char[] arr = new char[s.length()];
		stack st = new stack();
		for (int a = 0; a < s.length(); a++) {
			if (st.isEmpty()&&s.charAt(a) == ')') {
				if(st.pop(arr)=='('){
					--st.top;
				}
			}
			else if (st.isEmpty()&&s.charAt(a) == '}') {
				if(st.pop(arr)=='{'){
					--st.top;
				}
			}
			else if (st.isEmpty()&&s.charAt(a) == ']') {
				if(st.pop(arr)=='['){
					--st.top;
				}
			}else{
				st.push(arr, s.charAt(a));
			}
		}
		if(st.top==0){
			return 1;
		}else{
			return 0;
		}
	}

}
class stack {
	int top = 0;
	int num=0;
	public void push(char[] arr, char s) {
		arr[top] = s;
		top++;
	}

	public char pop(char []arr) {
		return arr[top-1];
	}
	public boolean isEmpty(){
		if(top==0){
			return false;
		}
		else{
			return true;
		}
	}
}
