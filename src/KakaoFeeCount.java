import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class KakaoFeeCount {

    public static void main(String[] args) {
        solution(new int[]{180, 5000, 10, 600},new String[]{"05:34 5961 IN", "06:34 5961 OUT", "07:34 5961 IN", "08:34 5961 OUT", "09:34 5961 IN", "10:34 5961 OUT", "11:34 5961 IN", "12:34 5961 OUT"});
    }
    public static int[] solution(int[] fees, String[] records) {
        Map<String,Integer> min = new HashMap<>();
        Map<String,String> out = new HashMap<>();
        for (String record : records){
            String temp[] = record.split(" ");
            if (!out.containsKey(temp[1])){
                out.put(temp[1],temp[0]);
            }else {
                String[] hour = temp[0].split(":");
                String[] mapHour = out.get(temp[1]).split(":");
                int mh = Integer.parseInt(mapHour[0])*60;
                int mm = Integer.parseInt(mapHour[1]);
                int mcur = mh+mm;
                int h = Integer.parseInt(hour[0])*60;
                int m = Integer.parseInt(hour[1]);
                int cur = h+m;
                min.merge(temp[1],cur-mcur,Integer::sum);
                out.remove(temp[1]);
            }
        }

        for (Map.Entry<String,String> p : out.entrySet()){
            String[] hour =  p.getValue().split(":");
            int h = Integer.parseInt(hour[0])*60;
            int m = Integer.parseInt(hour[1]);
            int cur = h+m;
            min.merge(p.getKey(),(23*60+59)-cur,Integer::sum);
        }
        List<String> keyList = new ArrayList<>(min.keySet());
        keyList.sort((s1, s2) -> s1.compareTo(s2));
        int t[] = new int[keyList.size()];
        int a=0;
        for (String key : keyList){
            int sum=fees[1];
            int temp=0;
            int val = min.get(key);
            if (val>=fees[0]){
                 temp = (int)Math.ceil((double) (val-fees[0])/fees[2])*fees[3];
            }
            t[a]=sum+temp;
            a++;
        }

        return t;
    }

}
