package org.example.learning1;

import java.util.ArrayList;
import java.util.List;

public record Card(Suit suit, Face face) {
    @Override
    public String toString() {
        return "%s%s(%d)".formatted(face.getValue(), suit.getSymbol(), face.getRank());
    }

    public static Card getNumericCard(Suit suit, int n) {
        Face f = Face.get(String.valueOf(n));
        return new Card(suit, f);
    }

    public static Card getFaceCard(Suit suit, char faceValue) {
        Face f = Face.get(String.valueOf(faceValue));
        return new Card(suit, f);
    }

    public static List<Card> getStandardDeck() {
        List<Card> cards = new ArrayList<>();
        for (Suit s : Suit.values()) {
            for (Face f : Face.values()) {
                cards.add(new Card(s, f));
            }
        }
        return cards;
    }

    public static void printDeck(List<Card> deck) {
        printDeck(deck, "Current Deck", 4);
    }

    public static void printDeck(List<Card> deck, String description, int rows) {
        int cardsInRow = deck.size() / rows;

        System.out.println("-".repeat(20));
        System.out.println(description);

        for (int i = 0; i < rows; i++) {
            int start = i * cardsInRow;
            int end = start + cardsInRow;
            deck.subList(start, end).forEach(c -> System.out.print(c + " "));
            System.out.println();
        }
    }
}
