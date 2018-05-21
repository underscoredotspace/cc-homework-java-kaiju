import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LochNessMonsterTest {
    LochNessMonster nessie;

    @Before
    public void before() {
        this.nessie = new LochNessMonster();
    }

    @Test
    public void hasName() {
        assertEquals("Nessie", nessie.getName());
    }

    @Test
    public void isAlive() {
        assertEquals(true, nessie.isAlive());
    }

    @Test
    public void isNotAlive() {
        nessie.damage(100);
        assertEquals(false, nessie.isAlive());
    }

    @Test
    public void canRoar() {
        assertEquals("*clears throat* ...ʀᴏᴀʀ", nessie.roar());
    }

    @Test
    public void move() {
        assertEquals("*Splish splash*", nessie.move());
    }
}