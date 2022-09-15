import java.util.*;

public class PerfectSquares {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(result(num));

    }

    private static int result(int n){
        Set<Integer> square  = new HashSet<>();

        int arr[] = new int[n+1];
        for (int a=1;a*a<=n;a++){
            square.add(a*a);
        }
        Arrays.fill(arr,Integer.MAX_VALUE);
        arr[0]=0;
        arr[1]=1;

        for(int sq : square){
            for (int a=2;a<=n;a++){
                if (a%sq==0){
                    arr[a] = Math.min(arr[a],a/sq);
                }
            }
        }

        for (int a=2 ; a<=n;a++){
            for (int sq : square){
                if (a>=sq){
                    arr[a] = Math.min(arr[a],arr[a-sq]+1);
                }
            }
        }
        return arr[n];
    }

}
