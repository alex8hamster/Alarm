package model;

import java.util.Scanner;

public class Choose {
    Scanner scanner = new Scanner(System.in);
    String enter;
    public String choose() {
        enter = scanner.nextLine();
        return enter;
    }
}
