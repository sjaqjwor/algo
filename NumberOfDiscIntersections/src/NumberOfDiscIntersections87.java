import java.util.Arrays;
import java.util.Comparator;

public class NumberOfDiscIntersections87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = new int[]{1,5,2,1,4,0};
		System.out.println(solution(arr));

	}
	static int solution(int []arr){
		Circle []circle = new Circle[arr.length];
		int count=0;
		for(int a=0;a<arr.length;a++){
			circle[a]=new Circle();
			circle[a].min=a-(long)arr[a];
			circle[a].max=(long)arr[a]+a;
		}
		Arrays.sort(circle,new Comparator<Circle>(){
			@Override
			public int compare(Circle c1,Circle c2){
				if (c1.min >= c2.min) {
					return 1;
				} else {
					return -1;
				}
			}
		});
		
		for(int a=0;a<arr.length;a++){
			for(int b=a+1;b<arr.length&&circle[a].max>=circle[b].min;b++){
				count++;
			}
		}
		return count;
	}
}
class Circle{
	long min;
	long max;
}
