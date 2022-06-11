public class CircleTest {

    public static void main(String[] args) {
        Circle c1= new Circle(2,"blue");
        Circle c2= new Circle(3);

        System.out.println("Circle C1 Radius: "+c1.getRadius());
        System.out.println("Circle C1 Colour: "+c1.getColour());
        System.out.println("Circle C2 Radius: "+c2.getRadius());

        c2.setColour("black");
        System.out.println("Circle C2 Colour: "+c2.getColour());

    }
}
