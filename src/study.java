import java.io.*;
import java.util.*;


public class study {
    public static void main(String[] args) throws IOException {
        String my_string = "programmers";
        int m = 1;
        int c = 1;

        StringBuilder sb = new StringBuilder("");

        for(int i = c-1; i<my_string.length(); i+=m) {
            sb.append(my_string.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
