package Zad1;

import java.lang.reflect.Array;
import java.util.Arrays;

public enum Season {
    SPRING ("wiosna", new String[]{"mar", "kwi", "maj"}),
    SUMMER ("lato", new String[]{"cze", "lip", "sie"}),
    AUTUMN ("jesien", new String[]{"wrz", "paz", "lis"}),
    WINTER("zima", new String[]{"gru","sty","lut"});

    private final String seasonName;
    private final String[] monthsName;

    Season(String seasonName, String[] monthsName) {
        this.seasonName = seasonName;
        this.monthsName = monthsName;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String[] getMonthsName() {
        return monthsName;
    }

    @Override
    public String toString() {
        return Arrays.toString(monthsName);
    }
}
