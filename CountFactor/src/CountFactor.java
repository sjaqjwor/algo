
public class CountFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(4));

	}

	static int solution(int N) {
		// Á¦°ö±Ù
		int num = (int) Math.sqrt(N);
		int count = 0;
		for (int k = 2; k <= num; k++) {
			if (N % k == 0) {
				count++;
			}
		}
		count = count * 2;
		if (num * num == N) {
			count -= 1;
		}
		count += 2;
		return count;
	}
}