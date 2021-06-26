import java.util.HashMap;

public class MapList {

    private HashMap<String, ProjectTask> mapList;

    public MapList() {
        this.mapList = new HashMap<>();
    }

    public HashMap<String, ProjectTask> getMapList() {
        return mapList;
    }

    public void setMapList(HashMap<String, ProjectTask> mapList) {
        this.mapList = mapList;
    }

    public void add(ProjectTask projectTask) {

        if (projectTask.getTask_id() != "0") {
            this.mapList.put(projectTask.getTask_id(), projectTask);
        }
    }

    @Override
    public String toString() {
        return "MapList{" +
                "mapList= " + mapList +
                '}';
    }
}
