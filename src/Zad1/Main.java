package Zad1;

import java.io.Serializable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Season s = getSeason();
        System.out.println(s.getSeasonName());
        if
    }

    public static Season getSeason (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pore roku");
        String results = scanner.nextLine();

        scanner.close();
        return Season.valueOf(results);
    }
}
