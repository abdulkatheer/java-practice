package org.example.learning1;

public enum Suit {
    CLUB(9827),
    DIAMOND(9830),
    HEART(9829),
    SPADE(9824);

    private char symbol;

    Suit(int symbol) {
        this.symbol = (char) symbol;
    }

    public char getSymbol() {
        return symbol;
    }
}
