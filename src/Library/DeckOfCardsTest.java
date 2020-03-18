package Library;
/**
 * This program:
 * - Randomly Card shuffling and dealing
 *
 * Some Notes:
 * -
 *
 * Created at 2020-03
 */

import java.security.SecureRandom;

public class DeckOfCardsTest {
    public static void main(String[] args) {

        // NOTE:
        // we declare a variable myDeckOfCards of type DeckOfCards, anytime we declare a variable a reference type of
        // non primitive type we need to use new operator to create an object of that type so new DeckOfCards says create
        // a new DeckOfCards object and then parenthesis call that objects constructor so that's going to result in lines
        // 18 to 54 of the DeckOfCards class being executed
        // once DeckOfCards initialized  we tell to shuffle itself so myDeckOfCards.shuffle is going to transfer control
        // to the DeckOfCards classes shuffle() method, which will perform shuffle algorithm
        // then in lines 19 through 25 we have for loop, that loops 50 times because 52 cards in the deck and for each
        // iteration of the loop we call myDeckOfCards.dealCard() is going to return a card object, but we outputting
        // that card object in a left justified field of 19 characters as a String (%-19s) is format specifiers for Strings
        // anything in Java can be treated as a String, when you try to output an object of any type as a String that
        // objects toString() method gets called to produce it's String representation
        // what we have after string specifier, even it is returning card object implicitly now Java will call the
        // DeckOfCardsSingleCard classes toString() method which will return that cards face and suit concatenated
        // String of information with the word of in between.
        // This is same as myDeckOfCards.dealCard().toString(), that is explicitly calling toString(), the way it is
        // written now is implicitly calling toString() for us
        // You can pass an object in Java anywhere a String is expected and Java will automatically call toString on that
        // object to get the String representation, that means you can concatenate if you will as well any object with a
        // String and have it become a String representational automatically also

        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle(); // place Cards in random order

        // print all 52 Cards in the order in which they are dealt
        for (int i = 1; i <= 52; i++) {

            // NOTE:
            // deal and display a Card
            // so we display one card in a left justified field of 19 characters, then if we have displayed four cards
            // we display new line character to move to the next line and we continue with the next iteration of the loop
            System.out.printf("%-19s", myDeckOfCards.dealCard());

            if (i % 4 == 0) // output a newline after every fourth card
                System.out.println();
        }
    }
} // end class DeckOfCardsTest

class DeckOfCards {

    private DeckOfCardsSingleCard[] deck; // array of Card objects
    private int currentCard; // index of next Card to be dealt (0-51)
    private static final int NUMBER_OF_CARDS = 52; // constant # of Cards

    // random number generator
    private static final SecureRandom randomNumbers = new SecureRandom();

    // constructor fills deck of Cards
    public DeckOfCards(){
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
                "Quenn", "King", };
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        // NOTE:
        // this one is a trap for new Java developers
        // [00:08:52] this does not create any card objects at line 35, it creates one object which is an array of DeckOfCardsSingleCard
        // variables and each of those elements/variables has the value null by default
        // so where Java programmers get trapped is that they create the array of cards and forget to create an actual
        // card objects that each array element should refer to
        // so not only do we need to create an array object, down at line 36 we initialize currentCard to zero
        // then at lines 39 to lines 40 we loop through deck array we just created in line 35
        // and one element at a time we create a new card object for that element, so we loop through the entire deck array
        // one element at a time, indexing from element zero and at line 40 we assign to current element to deck array a
        // new DeckOfCardsSingleCard object passing in to the constructor for that DeckOfCardsSingleCard object one of
        // the String of the faces array and one of the Strings of the suits array

        deck = new DeckOfCardsSingleCard[NUMBER_OF_CARDS]; // create array of Card objects
        currentCard = 0; // first Card dealt will be deck[0]

        // populate deck with Card objects
        for(int count = 0; count < deck.length; count++)
            deck[count] = new DeckOfCardsSingleCard(faces[count % 13], suits[count / 13]);

        // NOTE:
        // index count with remainder count (%) 13 gives the remainder after dividing count by 13 that always going to
        // be a value from 0 to 12 which are the indexes in to the faces array for these 13 strings
        // count (/) 13, count is an int 13 is an int that means the result is a whole number int value when you divide
        // count by 13 it is going always be a numbers of 0, 1, 2, or 3 and those are the indexes of suits array

        // AGAIN: we are walking through the deck array one element at a time creating DeckOfCardsSingleCard object for
        // every single individual element within the array, if you do not do this for reference type arrays you are
        // going to probably wind up with some null pointer exceptions at runtime because when you go then try to use
        // elements within the reference type array it is going to be trying call methods on the value null which is
        // null pointer exception they call it in the Java programming language even though we refer to things as
        // references the actual exception that occurs has the word pointer in it and that's left over little bit from
        // the days of C++ and Java was first being created back in mid 90's

    }

    // instance method, no static keyword
    public void shuffle(){
        // next call to method dealCard should start at deck[0] again
        currentCard = 0;

        // for each Card, pick another random Card (0-51) and swap them
        for(int first = 0; first < deck.length; first++) {

            // select random number between 0 and 51
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            // swap current Card with randomly selected Card
            // [00:12:25] about swapping
            DeckOfCardsSingleCard temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;

        }
    }

    // NOTE:
    // deal one Card
    // instance method, no static keyword
    // require an object class DeckOfCards in order to be called
    // [00:12:57]
    public DeckOfCardsSingleCard dealCard(){

        // determine whether Cards remain to be dealt
        if (currentCard < deck.length)
            return deck[currentCard++]; // return current Card in array
        else return null; // return null to indicate that all Cards were dealt
    }

} // end class DeckOfCards

class DeckOfCardsSingleCard{

    // NOTE:
    // instance variables, final variables become after they are initialized, so they are not initialized yet here
    // when constructor assigns a value then the variables become final and cannot be modified any further
    private final String face; // face of card ("Ace", "Deuce", ...)
    private final String suit; // suit of card ("Hearts", "Diamonds", ...)

    public DeckOfCardsSingleCard(String face, String suit){
        this.face = face;
        this.suit = suit;
    }

    // return String representation of Card
    public String toString(){
        return face + "of" + suit;
    }

} // end class DeckOfCardsSingleCard

