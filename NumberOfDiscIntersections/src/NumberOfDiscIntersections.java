import java.util.Arrays;
import java.util.Comparator;
//75%
public class NumberOfDiscIntersections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = new int[]{1,5,2,1,4,0};
		System.out.println(main(arr));
	
	}
	
	static int main(int []arr){
		int count=0;
		int max1=Integer.MAX_VALUE;
		
		long []min = new long[arr.length];
		long []max = new long[arr.length];
		
		for(int a=0;a<arr.length;a++){
			min[a]=a-(long)arr[a];
			max[a]=(long)arr[a]+a;
		}
		for(int a=arr.length-1;a>0;a--){
			for(int b=a-1;b>=0;b--)
			if(min[a]<=max[b]){
				count++;
			}
		}
		return count++;
	}
	
}
