import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Card card1;
    Card card2;
    Card card3;

    @Before
    public void before(){
        player = new Player("Kat");
        card1 = new Card(SuitType.SPADES,RankType.ACE);
        card2 = new Card(SuitType.DIAMONDS, RankType.FOUR);
        card3 = new Card(SuitType.CLUBS, RankType.TEN);
        player.addToHand(card1);
        player.addToHand(card2);
        player.addToHand(card3);
    }

    @Test
    public void isKatInTrouble(){
        boolean isShe = false;
       if(player.handValue() == 15) {
           isShe = true;
       }
        assertEquals(true,  isShe);
    }



}
