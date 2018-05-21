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

    public int getHealthValue() {
        return this.healthValue;
    }

    public abstract void attack(Kaiju kaiju);
}
