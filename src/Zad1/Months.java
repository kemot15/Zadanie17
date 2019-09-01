package Zad1;

import Zad1.Season;

import java.util.Arrays;

public class Months {
    private String[] month;
    private Season season;

    public Months() {
    }

    public Months(String[] month, Season season) {
        this.month = month;
        this.season = season;
    }

    @Override
    public String toString() {
        return Arrays.toString(month);
    }
}
