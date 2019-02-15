public class Cube {

    private Face top = new Face("white");
    private Face bottom = new Face("yellow");
    private Face front = new Face("green");
    private Face back = new Face("blue");
    private Face left = new Face("orange");
    private Face right = new Face("red");

    public Cube() {
        this.top = top;
        this.bottom = bottom;
        this.front = front;
        this.back = back;
        this.left = left;
        this.right = right;
    }
}
