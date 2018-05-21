public class Tank extends Vehicle {
    Tank() {
        super("Tank", 250);
    }

    @Override
    public void attack(Kaiju kaiju) {
        kaiju.damage(50);
    }
}
