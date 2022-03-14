public class Rectangle extends Shape implements IArea{
    private double sisi;

    public Rectangle(double sisi) {
        super();
        this.sisi = sisi;
    }

    @Override
    public double calculateArea() {
        // Dari interface area
        return sisi*sisi;
    }
    
    @Override
    public double calculatePerimeter() {
        // Dari abstract class
        return 4*sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
}