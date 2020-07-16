import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<Card>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public int getHandSize(){
        return this.hand.size();
    }

    public void addToHand(Card card){
        this.hand.add(card);
    }

    public int handValue(){
        int total = 0;
        for(Card card : this.hand){
        total += card.getValueFromEnum();
     }
     return total;
     }



}
