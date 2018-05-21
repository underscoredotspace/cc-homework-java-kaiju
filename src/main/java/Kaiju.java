public abstract class Kaiju {
    private String name;
    private int healthValue;
    private int attackValue;

    Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public abstract String move();

    public String roar() {
        return "*clears throat* ...ʀᴏᴀʀ";
    }

    public void attack(Vehicle vehicle) {
        vehicle.damage(this.attackValue);
    }

    public void damage(int attackValue) {
        this.healthValue -= attackValue;
    }

    public String getName() {
        return this.name;
    }

    public boolean isAlive() {
        return this.healthValue > 0;
    }

    public int getHealthValue() {
        return this.healthValue;
    }
}
