package Q11659;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numCount = Integer.parseInt(st.nextToken());
        int sumCount = Integer.parseInt(st.nextToken());

        int[] sum = new int[numCount+1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < numCount+1; i++) {
            sum[i] = sum[i - 1] + Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < sumCount; i++) {
            st = new StringTokenizer(br.readLine());
            int indexI = Integer.parseInt(st.nextToken());
            int indexJ = Integer.parseInt(st.nextToken());
            System.out.println(sum[indexJ] - sum[indexI-1]);
        }
    }
}
