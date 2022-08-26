package Deitel.chapter_7;

public class Cards {
    private final String face;
    private final String suit;

    public Cards(String cardface, String cardsuit){

        this.face = cardface;
        this.suit = cardsuit;
    }

    @Override
    public String toString() {
        return face + "of" + suit;
    }

}
