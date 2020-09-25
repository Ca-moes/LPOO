public class Ellipse implements AreaShape {
    private int x;
    private int y;

    public Ellipse(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public double getArea() {
        return Math.PI * x * y;
    }

    @Override
    public void draw() {
        System.out.println("Ellipse");
    }
}
