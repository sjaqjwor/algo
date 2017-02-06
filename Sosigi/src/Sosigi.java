import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Sosigi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ют╥б");
		int N = sc.nextInt();
		int num=0;
		int []visited = new int[N];
		Sosigi_ []arr = new Sosigi_[N];
		Sosigi_ []count = new Sosigi_[N];
		for(int a=0;a<N;a++ ){
			int b=sc.nextInt();
			int k=sc.nextInt();
			Sosigi_ s = new Sosigi_(b,k);
			arr[a]=s;
		}
		stack st = new stack();
		Arrays.sort(arr,new Comparator<Sosigi_>(){
			@Override
			public int compare(Sosigi_ c1,Sosigi_ c2){
				if (c1.l >= c2.l) {
					return 1;
				} else {
					return -1;
				}
			}
		});
		
		int temp=-1;
		
		while(true){
			
			for(int a=0;a<arr.length;a++){
				if(visited[a]!=1){
					temp = a;
					break;
				}
			}
			if(temp == -1) break;
			
			int prev = arr[temp].w;
			visited[temp]=1;
			for(int a=temp+1;a<arr.length;a++){
				if(visited[a]==1){
					continue;
				}
				if(prev > arr[a].w){
					continue;
				}else{
					visited[a]=1;
					prev=arr[a].w;
				}
			}
			num++;
			temp=-1;
		}
		System.out.println(num);
	}

}
class stack{
	int top=0;
	public void push(Sosigi_ []arr,Sosigi_ num){
		arr[top]=num;
		top++;
	}
	public Sosigi_ pop(Sosigi_ []arr){
		return arr[top-1];
	}
	public boolean em(){
		if(top==0){
			return true;
		}else{
			return false;
		}
	}
}
class Sosigi_{
	int l;
	int w;
	public Sosigi_(int l,int w){
		this.l=l;
		this.w=w;
	}
	
}
