package Zad1;

import java.lang.reflect.Array;
import java.util.Arrays;

public enum Season {
    SPRING ("wiosna"),
    SUMMER ("lato"),
    AUTUMN ("jesien"),
    WINTER("zima");

    private final String seasonName;

    Season(String seasonName) {
        this.seasonName = seasonName;
    }

    public String getSeasonName() {
        return seasonName;
    }

    @Override
    public String toString() {
        return name();
    }
}
