import java.io.*;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class boj2606 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int computerNo = Integer.parseInt(br.readLine());
        int testCase = Integer.parseInt(br.readLine());

        int [][] arr = new int[computerNo+1][computerNo+1];
        int [] arrCheck = new int[computerNo+1];
        arrCheck[1] = 1;

        for (int i = 0; i<testCase; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        int numOfInfected = myMethod(arr, arrCheck, 1);

        bw.write(String.valueOf(numOfInfected-1));
        bw.flush();
        bw.close();
    }

    public static int myMethod (int [][] array, int [] arrayCheck,int a) {
        for (int i = a; i < a + 1; i++) {
            for (int j = 1; j < array[i].length; j++) {
                if ((array[i][j] == 1) && (arrayCheck[j] == 0)) {
                    arrayCheck[j] = 1;
                    myMethod(array, arrayCheck, j);
                }
            }
        }
        int count = 0;
        for (int i = 0; i < arrayCheck.length; i++) {
            if (arrayCheck[i] == 1) count++;
        }
        return count;
    }
}







