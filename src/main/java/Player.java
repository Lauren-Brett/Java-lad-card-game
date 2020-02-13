public class Player {

    private Card card;

    public Player(){
        this.card = null;
    }

    public Card getCard(){
        return this.card;
    }

    public void addCardToPlayer(Card card) {
        this.card = card;
    }
}
