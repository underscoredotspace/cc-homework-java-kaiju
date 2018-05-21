public abstract class Vehicle {
    private String type;
    private int healthValue;

    Vehicle(String type, int healthValue) {
        this.type = type;
        this.healthValue = healthValue;
    }

    public void damage(int damageValue) {
        this.healthValue -= damageValue;
    }

    public abstract void attack(Kaiju kaiju);
}
