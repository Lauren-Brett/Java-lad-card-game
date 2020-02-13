import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Random;

public class Deck {

    private ArrayList<Card> deck;
    private ArrayList<Card> shuffledDeck;

    public Deck() {
        this.deck = new ArrayList<Card>();
        this.shuffledDeck = new ArrayList<Card>();
    }

    public ArrayList<Card> getCards() {
        return this.deck;
    }


    public void addCards() {
        for(SuitType suit : SuitType.values()){
            for(RankType rank : RankType.values()){
                deck.add(new Card(suit, rank));
            }
        }
        Collections.shuffle(deck);
    }

//    public void shuffleDeck(){
////        this.deck.addCards();
//       Collections.shuffle(deck);
//    }


    public Card dealCard() {
        return deck.get(0);

    }


}
