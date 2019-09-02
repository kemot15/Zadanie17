package zad1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String seasonStr = showSeasonValue(getSeason());
        try{
            Season season = Season.valueOf(seasonStr);
            System.out.println(seasonStr);
            showMonths(season);
        }catch (IllegalArgumentException e){
            System.out.println("Podana wartosc jest niepoprawna");
        }
    }

    public static String getSeason (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pore roku");
        String results = scanner.nextLine();
        scanner.close();
        return results;
    }

    public static String showSeasonValue (String seasonStr){
        Season[] seasons = Season.values();
            for (Season s : seasons){
                if (s.getSeasonName().equalsIgnoreCase(seasonStr)){
                    return s.name();
                }
            }
        return "";
    }

    public static void showMonths (Season season){
        String[] months = season.getMonthsName();
        for (String month : months){
            System.out.println(month);
        }
    }
}
