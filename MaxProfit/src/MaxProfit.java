
public class MaxProfit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int []arr = new int[]{23171, 21011, 21123, 21366, 21013, 21367};
			System.out.println(solution(arr));
	}
	static int solution(int []arr){
		int temp2=0;
		int temp3=0;
		for(int a=1;a<arr.length;a++){
			temp2=Math.max(0, temp2+arr[a]-arr[a-1]);
			temp3=Math.max(temp2, temp3);
		
		}
		return temp3;
	}
	

}
