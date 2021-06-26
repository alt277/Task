public class Main {
    public static void main(String[] args) {

        ProjectTask first = new ProjectTask("1", "001", ProjectTask.State.active);
        ProjectTask second = new ProjectTask("2", "002", ProjectTask.State.active);
        ProjectTask third = new ProjectTask("3", "001", ProjectTask.State.active);
        ProjectTask fourth = new ProjectTask("4", "007", ProjectTask.State.disabled);
        ProjectTask fifth = new ProjectTask(null, "007", ProjectTask.State.active);
        ProjectTask sixth = new ProjectTask("5", "007", null);

        MapList mapList = new MapList();
        mapList.add(first);
        mapList.add(second);
        mapList.add(third);
        mapList.add(fourth);
        mapList.add(fifth);
        mapList.add(sixth);
        System.out.println(mapList);

        System.out.println("Количество уникальных сотрудников,назначенных на активные задачи: "
                + Finder.findUniqueAssignee(mapList));

    }
}