import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;

public class Deck {
    Card card;

    private ArrayList<Card> decklist;
    private int deckSize;

    public Deck(int deckSize){
        this.deckSize = deckSize;
        this.decklist = new ArrayList<Card>();
    }

    public void buildDeck() {
        for(RankType rank : RankType.values()){
            Card card = new Card(SuitType.HEARTS, rank);
            this.decklist.add(card);
        }
        for(RankType rank : RankType.values()){
            Card card = new Card(SuitType.CLUBS, rank);
            this.decklist.add(card);
        }
        for(RankType rank : RankType.values()){
            Card card = new Card(SuitType.DIAMONDS, rank);
            this.decklist.add(card);
        }
        for(RankType rank : RankType.values()){
            Card card = new Card(SuitType.SPADES, rank);
            this.decklist.add(card);
        }
    }

    public int getSize(){
        return this.decklist.size();
    }

    public void shuffleDeck(){
        Collections.shuffle(decklist);
    }

    public Card dealCard(){
        Card dealtCard = this.decklist.remove(0);
        return dealtCard;
    }

}
