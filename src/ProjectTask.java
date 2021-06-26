public class ProjectTask {

    private String task_id;
    private String assignee_id;
    private String task_state;
    enum State {active,disabled}

    public ProjectTask(String task_id, String assignee_id, State state) {
        try {
            if (task_id == null) {
                this.task_id= "0";
                throw new Exception();
            }
            else this.task_id = task_id;
        }catch (Exception e){
            System.out.println("Поле task_id не должно быть пустым");
        }
        this.assignee_id = assignee_id;
        try  {
            if (state == null){
                this.task_state="disabled";
                throw new Exception();
            }
            else this.task_state= state.name();
        } catch (Exception e){
            System.out.println("Поле task_state не должно быть пустым");
        }
    }

    public String getTask_id() {
        return task_id;
    }

    public String getAsignee_id() {
        return assignee_id;
    }

    public String getTask_state() {
        return task_state;
    }

    public void setTask_id(String task_id) {
        this.task_id = task_id;
    }

    public void setAsignee_id(String asignee_id) {
        this.assignee_id = asignee_id;
    }

    public void setTask_state(String task_state) {
        this.task_state = task_state;
    }

    @Override
    public String toString() {
        return " Employee{" +
                "task_id='" + task_id + '\'' +
                ", asignee_id='" + assignee_id + '\'' +
                ", task_state='" + task_state + '\'' +
                '}' + '\n';
    }
}
