import java.util.Arrays;

public enum cards {
    /**
     * Initial intro to Java enum
     * The four suits in a deck of playing cards
     * TODO: add NO_TRUMP and rank values
     * @author W L Honig
     * @version 1 (May 2023)
     *
     * Enums are a bit like a Java primitive type.  Possible values are restricted to a set of names.
     * Think of the names as constants (hence, UPPER_CASE)
     * To use from another class in your project CardSuit.HEARTS, etc
     *
     * Enum values are test with ==  (NOT .equals)
     * Each enum has method values(); each of the named values has method ordinal()
     *
     * Reference materials on enum
     *      BJP Appendix C page 1187
     *      Oracle Java tutorial https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
     */

    CLUBS, DIAMONDS, HEARTS, SPADES;

    /**
     * Simple inline test code - should be removed for ease of reuse
     * @param args
     */
    public static void main(String[] args){
        CardSuit x = SPADES;
        CardSuit[] myLuckySuits = {HEARTS,DIAMONDS};
        CardSuit[] allSuits = CardSuit.values();

        System.out.println("A quick introduction to enum in Java - Enjoy something new!");
        System.out.println("The value assigned to DIAMONDS is: "+DIAMONDS.ordinal());
        System.out.println("The current value of variable x is: "+x+" and its internal representation is: "+x.ordinal());
        System.out.println("Here are my lucky suites: "+Arrays.toString(myLuckySuits));
        System.out.println("Here are all the CardSuits: "+Arrays.toString(allSuits));

    }

}