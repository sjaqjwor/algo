
public class EqualLeader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1, 2, 1, 1, 2, 1};
		System.out.println(solution(arr));
	}

	static int solution(int[] arr) {
		stack st = new stack();
		int[] pre_count = new int[arr.length];
		int same = 0;
			for (int c = 0; c < arr.length; c++) {
				if (st.em()) {
					st.push(pre_count, arr[c]);
					same++;
				} else if (st.pop(pre_count) == arr[c]) {
					st.push(pre_count, arr[c]);
					same++;
				} else {
					same--;
					if (same == 0) {
						st.top = 0;
						st.push(pre_count, arr[c]);
						same++;
					}
				}
			}
		int []post = new int[arr.length];
		int []back = new int[arr.length];
		same=0;
		for(int a=0;a<arr.length;a++){
			if(arr[a]==st.pop(pre_count)){
				same++;
				post[a]=same;
			}
			else{
				post[a]=same;
			}
		}
		same=0;
		for(int a=0;a<arr.length;a++){
			if(arr[a]!=st.pop(pre_count)){
				same++;
				back[a]=same;
			}else{
				back[a]=same;
			}
		}
		same=0;
		//post[arr.length-1]-post[a] 지금자리에서 뒤에 가장많은수 갯수
		//back[arr.length-1]-back[a] 지금 자리에서 뒤에 가장많은수가 아닌 다른수 갯수
		for(int a=0;a<arr.length;a++){
			if(post[a]>back[a]&&post[arr.length-1]-post[a]>back[arr.length-1]-back[a]){
				same++;
			}
		}
		
		
		return same;
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
