public class Godzilla extends Kaiju {
    Godzilla() {
        super("ゴジラ", 200, 20);
    }

    @Override
    public String move() {
        return "*Stomp stomp*";
    }
}
