public class LochNessMonster extends Kaiju {
    LochNessMonster() {
        super("Nessie", 100, 20);
    }

    @Override
    public String move() {
        return "*Splish splash*";
    }
}