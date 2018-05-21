import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GodzillaTest {
    Godzilla gojira;

    @Before
    public void before() {
        this.gojira = new Godzilla();
    }

    @Test
    public void hasName() {
        assertEquals("ゴジラ", gojira.getName());
    }

    @Test
    public void isAlive() {
        assertEquals(true, gojira.isAlive());
    }

    @Test
    public void isNotAlive() {
        gojira.damage(200);
        assertEquals(false, gojira.isAlive());
    }

    @Test
    public void canRoar() {
        assertEquals("*clears throat* ...ʀᴏᴀʀ", gojira.roar());
    }

    @Test
    public void move() {
        assertEquals("*Stomp stomp*", gojira.move());
    }
}