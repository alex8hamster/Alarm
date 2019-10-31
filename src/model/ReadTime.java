package model;

public class ReadTime {
    TaskModel taskModel = new TaskModel();
    String time = "Time";
    void readerAdd () {
        taskModel.add(time);
    }
    void readerRemove() {
        taskModel.remove(time);
    }
}
