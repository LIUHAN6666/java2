import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        double[][] scores = null;
        scores = new double[][]{
                {80.4, -1, -1},
                {96.2, -1, -1},
                {100.0, -1, -1},
                {78.9, -1, -1}
        };
//System.out.println(Arrays.deepToString(scores);
        scores[0][1] = 89.7;
        scores[1][1] = 90.5;
        scores[2][1] = 93.6;
        scores[3][1] = 88.1;
        //System.out.println(Arrays.deepToString(scores));
        double[][] newScores = null;
        newScores = new double[4][2];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                newScores[i][j] = scores[i][j];

                if(newScores[i][j] <90) {
                    newScores[i][j] += 2;
                }
            }
        }
        System.out.println(Arrays.deepToString(newScores));

    }
}
