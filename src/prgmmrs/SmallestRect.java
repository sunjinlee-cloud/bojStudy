package prgmmrs;

public class SmallestRect {
    public static void main(String[] args) {

        int [][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};

        int max0 = -1;
        int max1 = -1;
        for(int i = 0; i< sizes.length; i++) {
            if (sizes[i][1] > sizes[i][0]) {
                int temp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = temp;
            }
            if (max0 < sizes[i][0]) {
                max0 = sizes[i][0];
            }
            if (max1 < sizes[i][1]) {
                max1 = sizes[i][1];
            }
        }

        int answer = max0*max1;
        System.out.println(answer);

    }
}
