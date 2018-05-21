public class Jeep extends Vehicle {
    Jeep() {
        super("Jeep", 50);
    }

    @Override
    public void attack(Kaiju kaiju) {
        kaiju.damage(10);
    }
}
