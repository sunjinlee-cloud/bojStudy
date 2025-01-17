package prgmmrs;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class CleaningBackground {
    public static void main(String[] args) {
        String[] wallpaper = {"..", "#."};

        int wMin = 51;
        int wMax = -1;
        int hMin = 51;
        int hMax = -1;
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    if (wMin > j) wMin = j;
                    if (wMax < j) wMax = j;
                    if (hMin > i) hMin = i;
                    if (hMax < i) hMax = i;
                }
            }
        }
        int [] answer = {hMin,wMin,hMax+1,wMax+1};
    }
}
