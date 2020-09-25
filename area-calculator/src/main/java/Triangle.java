public class Triangle implements AreaShape{
    private double baseSize;
    private double heigth;

    public double getBaseSize() {
        return baseSize;
    }

    public void setBaseSize(double baseSize) {
        this.baseSize = baseSize;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }


    public Triangle(double baseSize, double heigth) {
        this.baseSize = baseSize;
        this.heigth = heigth;
    }

    @Override
    public double getArea() {
        return baseSize*heigth/2.0;
    }

    @Override
    public void draw() {
        System.out.println("Triangle");
    }
}
