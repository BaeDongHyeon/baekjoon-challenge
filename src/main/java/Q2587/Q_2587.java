package Q2587;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[5];

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(br.readLine());
            sum += nums[i];
        }

        int index = 0;
        while (index != 5) {
            int temp = nums[index];
            for (int i = index+1; i < nums.length; i++) {
                if (temp > nums[i]) {
                    nums[index] = nums[i];
                    nums[i] = temp;
                    temp = nums[index];
                }
            }
            index++;
        }

        System.out.println(sum/nums.length);    // 평균
        System.out.println(nums[2]);
    }
}
