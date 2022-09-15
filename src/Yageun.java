import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Yageun {

    public static void main(String[] args) {
        System.out.println(solution(4,new int[]{4,3,3}));
        System.out.println(solution(1,new int[]{2,1,2}));
        System.out.println(solution(3,new int[]{1,1}));

    }

    public static long solution(int n, int[] works) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (int work : works){
            priorityQueue.offer(work);
        }

        while (n>0){
            int temp = priorityQueue.poll();
            if (temp==0) break;
            priorityQueue.offer(temp-1);
            n--;
        }
        if (priorityQueue.peek()<=0){
            return 0;
        }
        int sum = 0;
        while (!priorityQueue.isEmpty()){
            sum+=Math.pow(priorityQueue.poll(),2);
        }
        return sum;
    }
}
