package Zad1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Season season = showSeasonValue(getSeason());
        System.out.println(season.toString());
        showMonths(season);
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

    public static void showMonths(Season seasonName){
        String[] q1 = {"gru", "sty", "lut"};
        Months months1 = new Months(q1, Season.SPRING);
        String[] q2 = {"mar", "kwi", "maj"};
        Months months2 = new Months(q2, Season.SPRING);
        String[] q3 = {"cze", "lip", "sie"};
        Months months3 = new Months(q3, Season.AUTUMN);
        String[] q4 = {"wrz", "paz", "lis"};
        Months months4 = new Months(q4, Season.AUTUMN);

        switch (seasonName){
            case WINTER:
                System.out.println(months1.toString());
                break;
            case SPRING:
                System.out.println(months2.toString());
                break;
            case SUMMER:
                System.out.println(months3.toString());
                break;
            case AUTUMN:
                System.out.println(months4.toString());
                break;
                default:
                    System.out.println("Bledna pora roku");
        }
    }
}
