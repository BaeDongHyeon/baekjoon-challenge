package Q2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strList = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String input = br.readLine();

        for (String str : strList) {
            input = input.replace(str, "?");
        }

        System.out.println(input.length());
    }
}
