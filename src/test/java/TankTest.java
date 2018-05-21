import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TankTest {
    private LochNessMonster nessie;
    private Tank tank;

    @Before
    public void before() {
        this.nessie = new LochNessMonster();
        this.tank = new Tank();
    }

    @Test
    public void canAttack() {
        tank.attack(nessie);
        assertEquals(50, nessie.getHealthValue());
    }
}