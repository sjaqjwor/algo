
public class EqualLeader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 4, 3, 4, 4, 4, 2 };
		System.out.println(solution(arr));
	}

	static int solution(int[] arr) {
		stack st = new stack();
		stack st1 = new stack();
		int[] pre_count = new int[arr.length];
		int[] pos_count = new int[arr.length];
		int same = 0;
		int same_2 = 0;
		int max_1 = 0;
		int num = 0;
		for (int a = 0; a < arr.length-1; a++) {
			for (int c = 0; c <= a; c++) {
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
			for (int b = a + 1; b < arr.length; b++) {
				if (st1.em()) {
					st1.push(pos_count, arr[b]);
					same_2++;
				} else if (st1.pop(pos_count) == arr[b]) {
					st1.push(pos_count, arr[b]);
					same_2++;
				} else {
					same_2--;
					if (same_2 == 0) {
						st1.top = 0;
						st1.push(pos_count, arr[b]);
						same_2++;
					}
				}
			}
			same=0;
			for(int a1=0;a1<=a;a1++){
				if(arr[a1]==st.pop(pre_count)){
					same++;
				}
			}
			same_2=0;
			for(int a1=a+1;a1<arr.length;a1++){
				if(arr[a1]==st1.pop(pos_count)){
					same_2++;
				}
			}
			if(a==0||(same>(a+1)/2&&same_2>((arr.length-1)-a)/2)){
				if(st.pop(pre_count)==st1.pop(pos_count)){
					num++;
				}
			}
			st1.top = 0;
			st.top = 0;
			same=0;
			same_2=0;
		}

		return num;

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
