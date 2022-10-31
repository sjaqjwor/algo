import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OpenKaKaoTalk {
    private static final String ENTER = "%s님이 들어왔습니다.";
    private static final String LEAVE = "%s님이 나갔습니다.";
    private static final String ENTER_KEYWORD = "Enter";
    private static final String CHANGE_KEYWORD = "Change";
    private static final String LEAVE_KEYWORD = "Leave";

    public static void main(String[] args) {
        String[] texts = solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"});
        for (String text : texts){
            System.out.println(text);
        }
    }

    public static String[] solution(String[] records) {
        Map<String, String> names = new HashMap<>();
        for (String record : records) {
            String[] info = record.split(" ");
            String keyWord = info[0];
            if (keyWord.equals(ENTER_KEYWORD) || keyWord.equals(CHANGE_KEYWORD)){
                String uuid = info[1];
                String name = info[2];
                names.put(uuid, name);
            }

        }

        List<String> result = new ArrayList<>();
        for (String record : records) {
            String[] info = record.split(" ");
            String keyWord = info[0];
            String uuid = info[1];
            String text = "";
            if (keyWord.equals(CHANGE_KEYWORD)){
                continue;
            }
            if (keyWord.equals(ENTER_KEYWORD)) {
                text = String.format(ENTER, names.get(uuid));
            }
            if (keyWord.equals(LEAVE_KEYWORD)) {
                text = String.format(LEAVE, names.get(uuid));
            }
            result.add(text);
        }

        return result.toArray(new String[0]);

    }


}
