package Q2738;

import java.io.*;

public class Q_2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] num = br.readLine().split(" ");
        int row = Integer.parseInt(num[0]);
        int column = Integer.parseInt(num[1]);

        String[][] matrix1 = new String[row][column];
        String[][] matrix2 = new String[row][column];

        for (int i = 0; i < row; i++) {
            matrix1[i] = br.readLine().split(" ");
        }
        for (int i = 0; i < row; i++) {
            matrix2[i] = br.readLine().split(" ");
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix1[i][j] = String.valueOf(Integer.parseInt(matrix1[i][j]) + Integer.parseInt(matrix2[i][j]));
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                bw.write(matrix1[i][j] + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
