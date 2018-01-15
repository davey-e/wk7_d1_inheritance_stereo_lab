import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class StereoTest {

    Stereo stereo;
    Radio radio;
    RecordDeck recordDeck;
    CDPlayer cdPlayer;

    @Before
    public void before(){
        radio = new Radio("Phillips", "T600");
        recordDeck = new RecordDeck("Technics", "T1000", 45);
        cdPlayer = new CDPlayer("Sony", "T800");
        stereo = new Stereo("Arnie The Stereo", radio, recordDeck, cdPlayer);
    }

    @Test
    public void hasName(){
        assertEquals("Arnie The Stereo", stereo.getName());
    }

    @Test
    public void hasRadio(){
        assertEquals(radio, stereo.getRadio());
    }

    @Test
    public void hasRecordDeck(){
        assertEquals(recordDeck, stereo.getRecordDeck());
    }

    @Test
    public void hasCDPlayer(){
        assertEquals(cdPlayer, stereo.getCDPlayer());
    }

    @Test
    public void canTuneRadio(){
        assertEquals("Radio 1", stereo.tuneRadio("Radio 1"));
    }

    @Test
    public void canPlayRecord(){
        assertEquals("I am playing", stereo.playRecord());
    }

    @Test
    public void canPlayCD(){
        assertEquals("I'm playing a CD", stereo.playCD());
    }
}
