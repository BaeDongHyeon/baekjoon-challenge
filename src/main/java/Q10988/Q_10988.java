package Q10988;

import java.util.Scanner;

public class Q_10988 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String word = scn.nextLine();
        StringBuilder sb = new StringBuilder(word);

        if (word.equals(sb.reverse().toString())) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }

    }
}
