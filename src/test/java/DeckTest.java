import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class DeckTest {

    private Card card;
    private Deck deck;
    private Player player;

    @Before
    public void before(){
        card = new Card(SuitType.HEARTS, RankType.TWO);
        deck = new Deck();
        player = new Player();
    }

    @Test
    public void canGetSuit() {
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(RankType.TWO, card.getRank());
    }

    @Test
    public void deckStartsEmpty(){
        assertEquals(0, deck.getCards().size());
    }

    @Test
    public void populateDeckWithCards(){
        deck.addCards();
        assertEquals(52, deck.getCards().size());
    }

    @Test
    public void dealCards(){
        deck.addCards();
//        deck.shuffleDeck();
        assertEquals(card.getRank(), deck.dealCard().getRank());
    }

    @Test
    public void playerDealtOneCard(){
        deck.addCards();
        deck.dealCard();

        assertEquals( , player.getCard());

        // size of deck decreases
        // player card = 1
        //
    }




}
