import java.util.HashSet;
import java.util.Map;

public class Finder {

    public static int findUniqueAssignee(MapList mapList){
        Map<String, ProjectTask> hashMap =mapList.getMapList();
        HashSet< String> unique=new HashSet<>();
        int counter=0;
        for (Map.Entry<String, ProjectTask> entry: hashMap.entrySet()) {

            if (entry.getValue().getTask_state()=="active") {
                unique.add(entry.getValue().getAsignee_id());
            }
            }
        for (String e: unique ) {
            counter++;

        }
     return counter;
    };
}
