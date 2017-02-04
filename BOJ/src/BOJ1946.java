import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BOJ1946 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int newp=1;
		int []c = new int[num];
		for(int a=0;a<num;a++){
			int count=sc.nextInt();
			newPeople []ne = new newPeople[count];
			for(int b=0;b<count;b++){//입력받기
				int point=sc.nextInt();
				int point2=sc.nextInt();
				newPeople np =  new newPeople(point,point2);
				ne[b]=np;
			}
			Arrays.sort(ne,new Comparator<newPeople>(){//서류심사 등수로 오름차순 정렬

				@Override
				public int compare(newPeople o1, newPeople o2) {
					// TODO Auto-generated method stub
					if(o1.point>=o2.point){
						return 1;
					}else{
						return -1;
					}
				}
				
			});
			int min=ne[0].point2;//오름차순으로 정렬된 첫번째꺼를 임시로 저장
			for(int a2=1;a2<ne.length;a2++){//비교
				if(min>ne[a2].point2){
					min=ne[a2].point2;
					newp++;
				}
			}
			c[a]=newp;
			newp=1;
		}
		for(int a=0;a<c.length;a++){
			System.out.println(c[a]);
		}
		
	}

}class newPeople{
	int point;
	int point2;
	public  newPeople(int a, int b){
		this.point=a;
		this.point2=b;
	}
}
