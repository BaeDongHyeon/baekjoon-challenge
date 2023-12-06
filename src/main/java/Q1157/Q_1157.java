package Q1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Q_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("");

        int[] alphabet = new int[26];
        for (String s : str) {
            char c = s.toLowerCase(Locale.ROOT).charAt(0);
            alphabet[c - 97]++;
        }

        int max = 0;
        int index = 0;
        for (int i=0; i<alphabet.length; i++) {
            if (alphabet[i] > max) {
                max = alphabet[i];
                index = i;
            }
        }

        int count = 0;
        for (int i=0; i<alphabet.length; i++)
            if (alphabet[i] == max) count++;

        if (count > 1)
            System.out.println("?");
        else
            System.out.println((char) (index + 65));
    }
}
