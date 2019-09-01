package Zad1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Season season = showSeasonValue(getSeason());
            System.out.println(season.name());
            System.out.println(season.toString());
          //  System.out.println(Arrays.toString(season.getMonthsName()));
        }catch (NullPointerException e){
            System.out.println("Bledna nazwa miesiaca");
        }
    }

    public static String getSeason (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pore roku");
        String results = scanner.nextLine();
        scanner.close();
        return results;
    }

    public static Season showSeasonValue (String seasonStr){
        Season season = null;
        Season[] seasons = Season.values();
        try {
            season = Season.valueOf(seasonStr);
        }catch (IllegalArgumentException e){
            for (Season s : seasons){
                if (s.getSeasonName().equalsIgnoreCase(seasonStr)){
                    season = s;
                    break;
                }
            }
        }
        return season;
    }
}
