import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class boj1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<Integer, String> hashMap1 = new HashMap<>();//해쉬맵1은 k-v 넘버-네임
        HashMap<String, Integer> hashMap2 = new HashMap<>();//해쉬맵2는 k-v 네임-넘버

        for(int i = 1; i<=N; i++) {
            String str = br.readLine();
            hashMap1.put(i,str);
            hashMap2.put(str,i);
        }

        for (int i = 0; i<M; i++) {
            String question = br.readLine();
            if (question.charAt(0)>64) {
                bw.write(String.valueOf(hashMap2.get(question)));
                bw.newLine();
            } else {
                bw.write(hashMap1.get(Integer.parseInt(question)));
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}
