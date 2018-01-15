import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RecordDeckTest {

    RecordDeck recordDeck;

    @Before
    public void before(){
        recordDeck = new RecordDeck(45, "Technics", "T1000");
    }

    @Test
    public void hasPlaySpeed(){
        assertEquals(45, recordDeck.getPlaySpeed());
    }

    @Test
    public void hasMake(){
        assertEquals("Technics", recordDeck.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("T1000", recordDeck.getModel());
    }

    @Test
    public void canPlay(){
        assertEquals("I am playing", recordDeck.play());
    }
}
