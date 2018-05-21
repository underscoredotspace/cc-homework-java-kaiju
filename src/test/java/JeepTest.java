import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JeepTest {
    private Jeep jeep;
    private Godzilla godzilla;

    @Before
    public void before() {
        jeep = new Jeep();
        godzilla = new Godzilla();
    }

    @Test
    public void canAttack() {
        jeep.attack(godzilla);
        assertEquals(190, godzilla.getHealthValue());
    }
}