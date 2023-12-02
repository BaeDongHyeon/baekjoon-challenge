package Q3003;

import java.util.Scanner;

public class Q_3003 {
    private static int[] chess_piece = {1, 1, 2, 2, 2, 8};

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input_piece[] = scn.nextLine().split(" ");

        String[] result_piece = new String[6];
        for (int i=0; i<result_piece.length; i++) {
            result_piece[i] = Integer.toString(chess_piece[i] -  Integer.parseInt(input_piece[i]));
        }

        System.out.print(String.join(" ", result_piece));
    }
}
