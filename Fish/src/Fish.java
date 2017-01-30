
public class Fish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[] { 4, 3, 2, 1, 5 };
		int[] B = new int[] { 0, 1, 0, 0, 0 };
		System.out.println(solution(A, B));
	}

	static int solution(int[] A, int[] B) {
		int[] stk = new int[A.length];
		stack st = new stack();
		int count=A.length;

		for (int a = 0; a < A.length; a++) {
			if (st.em()) {
				st.push(stk, a);
			} else if (!st.em() && B[st.pop(stk)] > B[a]) {
				while(!st.em()&&B[st.pop(stk)]!=B[a]){
					if (A[st.pop(stk)] < A[a]) {
						st.top--;
						st.push(stk, a);
						count--;
					
					}
					if(A[st.pop(stk)] > A[a]){
						count--;
						break;
					} 
					st.top--;
					
					
				}

			} else {
				st.push(stk, a);
			}
		}
		return count;
	}

}

class stack {
	int top = 0;

	public void push(int[] arr, int a) {
		arr[top] = a;
		top++;

	}

	public int pop(int[] arr) {
		return arr[top - 1];
	}

	public boolean em() {
		if (top == 0) {
			return true;
		} else {
			return false;
		}
	}
}
