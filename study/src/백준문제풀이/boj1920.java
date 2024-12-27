package 백준문제풀이;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);


        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i<M; i++) {
            int k = Integer.parseInt(st.nextToken());
            if (binarySearch(arr, k) >= 0){
                bw.write(String.valueOf(1));
                bw.newLine();
            } else {
                bw.write(String.valueOf(0));
                bw.newLine();
            }
        }

//        int M = Integer.parseInt(br.readLine());
//        st = new StringTokenizer(br.readLine());
//        for (int i = 0; i<M; i++) {
//            int k = Integer.parseInt(st.nextToken());
//            if (Arrays.binarySearch(arr, k) >= 0){
//                bw.write(String.valueOf(1));
//                bw.newLine();
//            } else {
//                bw.write(String.valueOf(0));
//                bw.newLine();
//            }
//        }
        bw.flush();
        bw.close();
    }
    public static int binarySearch(int[] arr, int key){
        int mid;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            mid = (low + high) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
