public class Car extends Vehicle {

    private boolean junkInTheTrunk;

    public boolean isJunkInTheTrunk() {
        return junkInTheTrunk;
    }

    public void setJunkInTheTrunk(boolean junkInTheTrunk) {
        this.junkInTheTrunk = junkInTheTrunk;
    }

    public String honk() {
        return "Bee...eeep";
    }
}
