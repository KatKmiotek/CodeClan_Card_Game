import java.util.ArrayList;

public class Game {

    private ArrayList<Player> playerList;
    private Deck deck;


    public Game(){
    this.playerList = new ArrayList<Player>();
    this.deck = new Deck(52);
    }

    public void addPlayerToGame(Player player){
        this.playerList.add(player);
    }

    public int getPlayerCount(){
        return this.playerList.size();
    }

    public Player getPlayer(Player player){
        int index = this.playerList.indexOf(player);
        return this.playerList.get(index);
    }

    public Deck getDeck() {
        return deck;
    }

    public void dealCard(Player player){
        Card dealtcard = this.deck.dealCard();
        this.getPlayer(player).addToHand(dealtcard);
    }
}
