
public class Nesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="(()(())())";
		System.out.println(solution(a));
		
	}
	static int solution(String s){
		int count=0;
		for(int a=0;a<s.length();a++){
			if(s.charAt(a)=='('){
				count++;
			}else{
				if(count==0){
					return 0;
				}else{
					count--;
				}
			}
		}
		if(count==0){
			return 1;
		}else{
			return 0;
		}
	}

}
