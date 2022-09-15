import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class MoreSpice {


    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 9, 10, 12},7));
    }
    public static int solution(int[] scoville, int K) {
        PriorityQueue<Integer> priority = new PriorityQueue<>();
        for (int sco : scoville){
            priority.add(sco);
        }
        int answer = 0;

        while (priority.size()>=2 && K>priority.peek()){
            int sc = priority.poll();
            int sc2 = priority.poll();
            priority.add(sc+(sc2*2));
            answer++;
        }

        return priority.peek()<K ? -1 : answer;
    }
}
