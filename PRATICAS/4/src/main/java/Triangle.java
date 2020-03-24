public class Triangle implements AreaShape {
    private double baseSize, height;

    public Triangle(double baseSize, double height) {
        this.baseSize = baseSize;
        this.height = height;
    }

    public double getBaseSize() {
        return baseSize;
    }

    public void setBaseSize(double baseSize) {
        this.baseSize = baseSize;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (this.baseSize * this.height) / 2;
    }

    public void draw(){
        System.out.println("Triangle");
    }
}