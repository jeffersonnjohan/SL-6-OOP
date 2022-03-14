public class Triangle extends Shape implements IArea{
    private double alas;
    private double tinggi;

    public Triangle(double alas, double tinggi) {
        super();
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double calculateArea() {
        // Dari interface area
        return alas*tinggi/2;
    }
    
    @Override
    public double calculatePerimeter() {
        // Dari abstract class
        // Di sini asumsi segitiganya adalah siku-siku
        double miring = Math.sqrt(alas*alas + tinggi*tinggi);
        return alas+tinggi+miring;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
}
