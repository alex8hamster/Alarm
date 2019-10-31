package model;

import controller.ScanFromKeybord;
import view.View;

import java.util.ArrayList;

public class TaskModel {
   private ArrayList arrayList = new ArrayList();
View view = new View();
  public void add(String time) {
        arrayList.add(time);
        view.update(arrayList);

    }
   public void remove (String time) {
arrayList.remove(time);

    }

    public ArrayList getArrayList() {
        return arrayList;
    }
}
