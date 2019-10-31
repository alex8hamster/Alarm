package model;

import java.util.Scanner;

public class GeneralModel {
    Scanner scanner = new Scanner(System.in);
    String string;
    public String scan() {
        string = scanner.nextLine();
        return string;
    }
    public void exit() {
        System.exit(0);
    }
}
