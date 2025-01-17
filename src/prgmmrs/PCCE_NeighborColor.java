package prgmmrs;

public class PCCE_NeighborColor {
    public static void main(String[] args) {

        String[][] board = {{"yellow", "green", "blue"}, {"blue", "green", "yellow"}, {"yellow", "blue", "blue"}};
        int h = 0;
        int w = 1;

        int yLimit = board.length;
        int xLimit = board[0].length;

        String mainColor = board[h][w];

        int [] dx = {1,0,-1,0};
        int [] dy = {0,1,0,-1};
        int sameColor = 0;

         for (int i = 0; i<4; i++) {
             if (0<=h+dx[i]&& h+dx[i]<xLimit && 0<=w+dy[i] && w+dy[i]<yLimit) {
                 if (board[h+dx[i]][w+dy[i]].equals(mainColor)) {
                     sameColor ++;
                 }
             }
         }

        System.out.println(sameColor);
    }
}
