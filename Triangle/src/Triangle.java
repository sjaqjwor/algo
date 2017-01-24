import java.util.Arrays;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = new int[]{};
		System.out.println(t(arr));
	}
	static int t(int []arr){
		Arrays.sort(arr);
		int count=0;
		for(int a=arr.length-1;a>=2;a--){
			if(arr[a]<arr[a-1]+arr[a-2]){
				return 1;
			}
		}
		return 0;
	}
}
