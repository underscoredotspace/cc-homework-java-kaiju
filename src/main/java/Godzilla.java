public class Godzilla extends Kaiju {
    Godzilla() {
        super("ゴジラ", 200, 50);
    }

    @Override
    public String move() {
        return "*Stomp stomp*";
    }
}
