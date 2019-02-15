public class Truck extends Vehicle {

    private int tow;

    public int getTow() {
        return tow;
    }

    public void setTow(int tow) {
        this.tow = tow;
    }

    @Override
    public String honk() {
        return "BIG BEEP";
    }
}
