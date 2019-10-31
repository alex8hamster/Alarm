package view;

import controller.ScanFromKeybord;
import model.TaskModel;

import java.util.ArrayList;

public class View {


   public void start() {

        System.out.println("1. Добавить ");
        System.out.println("2. Удалить ");
       System.out.println("3. Обновить ");
        System.out.println("4. Выйти ");

    }
    public boolean update(ArrayList arrayList){
        System.out.println(arrayList);//Прототип не по паттерну MVC
        return true;
    }

    public void sayAdd() {
        System.out.println(" Введите дату и время добавления задачи: ");
    }
    public void sayRemove () {
        System.out.println(" Введите дату и время удаления задачи: ");

    }
    public void sayExit() {
        System.out.println(" Вы успешно вышли из программы: ");

    }
}
