import java.util.Arrays;

public class JumpGameTwo{

    public static void main(String[] args) {
        System.out.println(ans(new int[]{2,3,1,1,4}));
        System.out.println(ans(new int[]{2,3,0,1,4}));
    }

    public static int ans(int num[]){

        int temp [] = new int[num.length];
        Arrays.fill(temp,Integer.MAX_VALUE);
        temp[0]=0;
        for (int a=0;a<num.length;a++){
            int count = temp[a]+1;
            for (int b=1;b<=num[a] && a+b<temp.length;b++){
                temp[a+b]=Math.min(count,temp[a+b]);
            }
        }


        return temp[temp.length-1];
    }

}
