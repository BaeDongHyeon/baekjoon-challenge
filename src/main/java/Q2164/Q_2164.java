package Q2164;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Card {

    private final Queue<Integer> card = new LinkedList<>();

    public Card(int num) {
        for (int i=1; i<=num; i++) {
            card.add(i);
        }
    }

    private void remove() {
        card.remove();
    }

    private void down() {
        int num = card.poll();
        card.add(num);
    }

    public Integer shuffle() {
        while (card.size() > 1) {
            remove();
            down();
        }
        return card.poll();
    }
}

public class Q_2164 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Card card = new Card(scn.nextInt());
        System.out.println(card.shuffle());
    }
}
