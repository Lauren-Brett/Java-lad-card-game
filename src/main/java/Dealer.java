import java.util.ArrayList;

public class Dealer {

    private Deck deck;
    private Player player1;
    private Player player2;

    public Dealer(){
        this.deck = new Deck();

        this.player1 = new Player();
        this.player2 = new Player();
    }

    // dealCard - player1
    // if p1.card.rank > p2.card.rank = p1 wins

    public void givePlayerCard(Player player){
       Card card = this.deck.dealCard();
       player.addCardToPlayer(card);

    }


}
