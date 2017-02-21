
public class MaxSliceSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int []arr = new int[]{3,2,-6,4,0};
			System.out.println(solution(arr));
	}
	static int solution(int []arr){
		int []temp = new int[arr.length];
		int max=0,max1=0;
		int sum=0;
		if(arr.length==1){
			return arr[0];
		}
		max1=Integer.MIN_VALUE;
		for(int a=0;a<arr.length;a++){
			sum+=arr[a];
			sum=Math.max(sum,arr[a]);
			if(max1<sum){
				max1=sum;
			}
		}
		return max1;
	}

}
