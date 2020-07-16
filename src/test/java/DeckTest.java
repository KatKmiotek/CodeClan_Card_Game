import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void before(){
        this.deck = new Deck(52);
        this.deck.buildDeck();
    }

    @Test
    public void fullDeckGenerated(){
        assertEquals(52, this.deck.getSize());
    }

    @Test
    public void testTheSuffle(){
        Deck deck2 = new Deck(52);
        deck2.buildDeck();
        this.deck.shuffleDeck();
        assertNotEquals(deck2, this.deck);
    }

    @Test
    public void canDealCard(){
        this.deck.dealCard();
        assertEquals(51, this.deck.getSize());
    }
}
