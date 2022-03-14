public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5);
        System.out.println("Luas dari rectangle dengan sisi " + rectangle1.getSisi() + " adalah " + rectangle1.calculateArea() + " dan kelilingnya adalah " + rectangle1.calculatePerimeter());

        Circle circle1 = new Circle(7);
        System.out.println("Luas circle dengan sisi " + circle1.getR() + " adalah " + circle1.calculateArea() + " dan kelilingnya adalah " + circle1.calculatePerimeter());

        Triangle triangle1 = new Triangle(6, 8);
        System.out.println("Luas triangle dengan alas " + triangle1.getAlas() + " dengan tinggi " + triangle1.getTinggi() + " adalah " + triangle1.calculateArea() + " dan kelilingnya adalah " + triangle1.calculatePerimeter());


    }
}
