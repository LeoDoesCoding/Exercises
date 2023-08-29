public class CircleTest {
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        System.out.println(myCircle.getArea());

        Circle myCircleV2 = new Circle(20);
        System.out.println(myCircleV2.getArea());
    }
}

class Circle{
    private double radius = 1.0;
    private String colour = "red";

    public Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }

    //Getters
    public double getRadius() {return radius;}
    public double getArea() {return ((radius * radius) * 3.142);}
}
