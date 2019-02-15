public class Row {

    private Cell left;
    private Cell center;
    private Cell right;

    public Row(String color) {
        this.left = new Cell(color);
        this.center = new Cell(color);
        this.right = new Cell(color);
    }
}
