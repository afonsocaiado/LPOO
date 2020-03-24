public class Rectangle implements AreaShape {

    private double width;
    private double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWitdth() {
        return width;
    }

    public void setWitdth(double witdth) {
        this.width = witdth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    public void draw(){
        System.out.println("Rectangle");
    }
}
