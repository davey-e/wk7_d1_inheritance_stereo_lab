import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before(){
        radio = new Radio("Phillips", "T600");
    }

    @Test
    public void canTune(){
        assertEquals("Radio 1", radio.tune("Radio 1"));
    }

    @Test
    public void hasMake(){
        assertEquals("Phillips", radio.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("T600", radio.getModel());
    }
}
