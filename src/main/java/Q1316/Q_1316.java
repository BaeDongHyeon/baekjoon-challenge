package Q1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 0; i < number; i++) {
            if (groupChecker(br.readLine())) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static boolean groupChecker(String word) {
        Queue<String> list = new LinkedList<>(Arrays.asList(word.split("")));
        List<String> complete = new ArrayList<>();

        String previous = "";
        while (!list.isEmpty()) {
            String next = list.poll();
            if (!previous.equals(next)) {
                complete.add(previous);
                previous = next;
                if (complete.contains(next)) {
                    return false;
                }
            }
        }
        return true;
    }
}
