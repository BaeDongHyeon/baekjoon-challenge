package Q9012;

import java.util.Scanner;
import java.util.Stack;

class Vps {
    private Stack<String> psStr = new Stack<>();

    public String pairCheck(String ps) {
        psStr.clear();
        for (String s : ps.split("")) {
            if (!psStr.isEmpty()) {
                String ss = psStr.pop();
                if (!isVps(ss, s)) {
                    psStr.add(ss);
                    psStr.add(s);
                }
            } else {
                psStr.add(s);
            }
        }
        if (psStr.isEmpty()) {
            return "YES";
        }
        return "NO";
    }

    private boolean isVps(String a, String b) {
        if (a.equals("(") && b.equals(")")) {
            return true;
        }
        return false;
    }
}

public class Q_9012 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Vps vps = new Vps();

        int num = scn.nextInt();
        String[] list = new String[num];
        for (int i=0; i<num; i++) {
            list[i] = scn.next();
        }
        for (String str : list) {
            System.out.println(vps.pairCheck(str));
        }
    }
}
