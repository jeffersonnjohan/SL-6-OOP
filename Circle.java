public class Circle extends Shape implements IArea{
    private double r;
    
    public Circle(double r) {
        super();
        this.r = r;
    }

    @Override
    public double calculateArea() {
        // Dari interface area
        return Math.PI * r * r;
    }
    
    @Override
    public double calculatePerimeter() {
        // Dari abstract class
        return 2 * Math.PI * r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
