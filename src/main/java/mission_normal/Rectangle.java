package mission_normal;

public class Rectangle extends PlaneFigure implements Shape {
    private  double width, height;


    Rectangle(String color, String name, double width, double height) {
        super(name, color);
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
