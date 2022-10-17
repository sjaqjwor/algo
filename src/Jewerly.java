import java.util.*;
import java.util.stream.Collectors;

public class Jewerly {


    public static void main(String[] args) {

        int ans[] = solution(new String[]{"DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"});
        for (int index : ans) {
            System.out.println(index);
        }
    }

    // 이렇게 하면 답은 찾으나... 맨처음꺼는 못찾음
    public static int[] solution_not(String[] gems) {
        Set<String> uniqueGems = Arrays.stream(gems).collect(Collectors.toSet());
        int uniqueGemsSize = uniqueGems.size();
        if (uniqueGemsSize == 1) {
            return new int[]{1, 1};
        }

        Map<String, Integer> countMap = new HashMap<>();
        for (String gem : gems) {
            countMap.merge(gem, 1, Integer::sum);
        }

        int firstIndex = 0;
        int lastIndex = gems.length - 1;
        while (lastIndex >= firstIndex) {
            String firstGem = gems[firstIndex];
            String lastGem = gems[lastIndex];
            boolean hasFirstGem = hasGem(countMap, firstGem);
            boolean hasLasttGem = hasGem(countMap, lastGem);
            if (!hasFirstGem && !hasLasttGem) {
                break;
            }
            if (hasGem(countMap, firstGem)) {
                firstIndex++;
                countMap.put(firstGem, countMap.get(firstGem) - 1);
            }
            if (hasGem(countMap, lastGem)) {
                lastIndex--;
                countMap.put(lastGem, countMap.get(lastGem) - 1);
            }
        }

        int[] answer = {firstIndex + 1, lastIndex + 1};
        return answer;
    }

    public static int[] solution(String[] gems) {
        Set<String> uniqueGems = Arrays.stream(gems).collect(Collectors.toSet());
        int uniqueGemsSize = uniqueGems.size();
        if (uniqueGemsSize == 1) {
            return new int[]{1, 1};
        }
        Queue<String> queue = new LinkedList<>();
        Map<String, Integer> countMap = new HashMap<>();
        int startIndex = 0;
        int start = 0;
        int max = Integer.MAX_VALUE;
        int last = 0;
        for (int index = 0; index < gems.length; index++) {
            String gem = gems[index];
            countMap.put(gem, countMap.getOrDefault(gem, 0) + 1);
            queue.add(gem);
            while (countMap.get(queue.peek()) > 1) {
                String queueGem = queue.poll();
                countMap.put(queueGem, countMap.get(queueGem) - 1);
                startIndex++;
            }

            if (countMap.size() == uniqueGemsSize) {
                if (max > queue.size()) {
                    start = startIndex;
                    max = queue.size();
                }
            }

        }


        return new int[]{start + 1, (start+max)};
    }

    private static boolean hasGem(Map<String, Integer> gems, String gem) {
        int count = gems.get(gem);
        return count - 1 > 0;
    }
}
