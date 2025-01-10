import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class boj1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        TreeSet<String> notHeard = new TreeSet<>();
        String [] notSeen = new String[M];

        for (int i = 0; i<N; i++) {
            notHeard.add(br.readLine());
        }
        for (int i = 0; i<M; i++) {
            notSeen[i] = br.readLine();
        }
        Arrays.sort(notSeen);

        int count = 0;

        for (int i =0; i<M; i++) {
            if (!notHeard.contains(notSeen[i])) {
                notSeen[i] = "0";
            } else {
                count++;
            }
        }
        bw.write(String.valueOf(count));
        bw.newLine();
        for(String str:notSeen) {
            if (str.equals("0")) {
                continue;
            } else {
                bw.write(str);
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}
