package controller;

import model.Choose;
import model.GeneralModel;
import model.TaskModel;
import view.View;

import java.util.ArrayList;

public class ScanFromKeybord {
    GeneralModel generalModel = new GeneralModel();
    Choose choose = new Choose();
    View view = new View();
    TaskModel taskModel = new TaskModel();
    public void start(){
        view.start();
        String buff;
        switch (choose.choose()) {
            case "1":
            view.sayAdd();
            buff = generalModel.scan();
            taskModel.add(buff);
            start();
                break;
            case "2":
                view.sayRemove();
                buff = generalModel.scan();
                taskModel.remove(buff);
                start();
                break;
            case "4":
                view.sayExit();
                generalModel.exit();
                break;
            case "3":
                view.update(taskModel.getArrayList());
                start();
                break;
        }
    }
}
