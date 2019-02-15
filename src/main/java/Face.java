public class Face {

    private Row top;
    private Row middle;
    private Row bottom;

    public Face(String color) {
        this.top = new Row(color);
        this.middle = new Row(color);
        this.bottom = new Row(color);
    }
}
