import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    Game game;
    Player player1;
    Player player2;
    Player player3;

    @Before
    public void before(){
        game = new Game();
        this.game.getDeck().buildDeck();
        player1 = new Player("Kat");
        player2 = new Player("Tino");
        player3 = new Player("Luke");
        game.addPlayerToGame(player1);
        game.addPlayerToGame(player2);
        game.addPlayerToGame(player3);
    }

    @Test
    public void areTherePlayers(){
        assertEquals(3, this.game.getPlayerCount());
    }

    @Test
    public void canDealHands(){
        this.game.dealCard(player1);
        assertEquals(1, this.game.getPlayer(player1).getHandSize());
        assertEquals(51, this.game.getDeck().getSize());
    }
}