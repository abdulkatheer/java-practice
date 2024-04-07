package org.example.learning1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Card> standardDeck = Card.getStandardDeck();
        System.out.println(standardDeck);

        Card jH = Card.getFaceCard(Suit.HEART, 'J');
        System.out.println(jH);

        Card numericCard = Card.getNumericCard(Suit.SPADE, 2);
        System.out.println(numericCard);

        Card.printDeck(standardDeck);

        // fill
        Card aceOfHeart = Card.getFaceCard(Suit.HEART, 'A');
        Card[] aceOfHeartsArr = new Card[13];
        Arrays.fill(aceOfHeartsArr, aceOfHeart);
        Card.printDeck(Arrays.asList(aceOfHeartsArr), "Ace of heart Array", 1);

        List<Card> aceOfHeartsList = new ArrayList<>(52);
        Collections.fill(aceOfHeartsList, aceOfHeart);
        System.out.println(aceOfHeartsList);
        System.out.println(aceOfHeartsList.size());

        // nCopies
        aceOfHeartsList = Collections.nCopies(13, aceOfHeart);
        Card.printDeck(aceOfHeartsList, "Ace of heart List", 1);


    }
}
