package ua.hilell.Homework05;
import java.util.List;

public class TaskWithAnAsterisk {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        for (int i = 1; i <= 4; i++) {
            List <Card> hand = deck.deal(5);
            System.out.println("Игрок " + i + " получает карты: ");
            for (Card card : hand) {
                System.out.println(card);
            }
            System.out.println();
        }
    }
}
