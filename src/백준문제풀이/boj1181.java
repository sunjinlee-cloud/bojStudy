package 백준문제풀이;

import java.io.*;
import java.util.Comparator;
import java.util.TreeSet;

public class boj1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        TreeSet<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                return o1.length() - o2.length();
            }
        });
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i<N; i++) {
            String str = br.readLine();
            treeSet.add(str);
        }

        for (String str : treeSet) {
            bw.write(str);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
