public class Circle {
    private double radius=1.0;
    private String colour="red";

    public Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public double getArea(double radius){
        return Math.PI*radius*radius;

    }
}
