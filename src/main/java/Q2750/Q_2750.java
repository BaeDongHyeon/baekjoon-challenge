package Q2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2750 {
    private static int[] sortList;
    private static int[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        sortList = new int[n];
        for (int i = 0; i < n; i++) {
            sortList[i] = Integer.parseInt(br.readLine());
        }

        result = new int[n];
        mergeSort(0, sortList.length-1);

        for (int r : sortList) {
            System.out.println(r);
        }
    }
    public static void mergeSort(int start, int end) {
        if (start<end) {
            int mid = (start+end) / 2;
            mergeSort(start, mid);
            mergeSort(mid+1, end);

            int p = start;
            int q = mid + 1;
            int idx = p;

            while (p<=mid || q<=end) {
                if (q>end || (p<=mid && sortList[p]<sortList[q])) {
                    result[idx++] = sortList[p++];
                } else {
                    result[idx++] = sortList[q++];
                }
            }

            for (int i=start;i<=end;i++) {
                sortList[i]=result[i];
            }
        }
    }
}
