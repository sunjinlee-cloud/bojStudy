package prgmmrs;


// !!!!@@@@@@@!!!!!!! 아직 덜풀었음!!!!!!!!@@@@@@@@@@@!!!!!!!!!!!!




public class PCCE10 {
    public static void main(String[] args) {

        String [][] park = {{"A", "A", "-1", "B", "B", "B", "B", "-1"}, {"A", "A", "-1", "B", "B", "B", "B", "-1"}, {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"}, {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}, {"D", "D", "-1", "-1", "-1", "-1", "-1", "F"}, {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}};

        check = new int[park.length][park[0].length];

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length; j++) {
                if (park[i][j].equals("-1")) {

                }
            }
        }

        int answer = 0;
    }

    static String [][] park;
    static int[][] check;
    static int[] dw = {1, 0, 1};
    static int[] dh = {0, 1, 1};

    void findEmptyRect(int i, int j) {
        check[i][j] = 1;
        for (int k = 0; k<3; k++) {
            if (i+dw[k]< park.length && j+dh[k]<park[i].length && check[i+dw[k]][j+dh[k]]==1) {
                continue;
            } else if (i+dw[k]< park.length && j+dh[k]<park[i].length && park[i+dw[k]][j+dh[k]].equals("-1")) {
                check[i][j] = 1;

            }
        }
    }
}


/*해야하는 것:
1. 우, 하, 하우 x축과 y축 이동 각각 배열만들기
2. 방문 체크할 배열 만들기
3. 우, 하, 하우를 한 묶음으로 만들어서 한 묶음이 -1로 완료될때마다 size++; 하기
3-1. 한 묶음이 새로운 대상이 되는 식으로 재귀함수
4. 돗자리 리스트의 크기와 size 비교해서 mats[i]<=size 인 값을 answer 에 넣어 반환
 */