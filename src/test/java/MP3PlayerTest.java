import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MP3PlayerTest {

    MP3Player mp3Player;

    @Before
    public void before(){
        mp3Player = new MP3Player();
    }

    @Test
    public void canConnect(){
        assertEquals("I am connected!", mp3Player.connect());
    }
}
