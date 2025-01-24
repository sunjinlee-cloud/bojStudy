import java.io.*;
import java.util.*;


public class study {
    public static void main(String[] args) throws IOException {



        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};


        int pointer1 = 0;
        int pointer2 = 0;
        String answer;

        for (int i = 0; i< goal.length; i++) {
            if (goal[i].equals(cards1[pointer1]) && pointer1<cards1.length) {
                pointer1++;
            } else if ( goal[i].equals(cards2[pointer2]) && pointer2< cards2.length) {
                pointer2++;
            } else {
                answer = "No";

            }
        }
        answer = "Yes";
































        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//            StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int studentNo = Integer.parseInt(st.nextToken());
            String [] arr = new String[studentNo];
            int sum = 0;

            for (int j = 0; j<studentNo; j++) {
                arr[j] = st.nextToken();
                sum += Integer.parseInt(arr[j]);
            }

            float avr = sum / studentNo;
            double aboveAvr = 0.0;

            for (int k = 0; k<studentNo; k++) {
                if (Double.parseDouble(arr[k]) > avr) { aboveAvr ++;}
            }

//            double result = Math.round((aboveAvr/studentNo)*100000)/1000.0;
            String s = String.format("%.3f", aboveAvr/studentNo*100.0);
            bw.write(s+"%");
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
