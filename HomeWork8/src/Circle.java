public class Circle implements GraphicalEditor{

    @Override
    public String print() {
        return "Circle";
    }

    @Override
    public void print(ShapeName shapeName) {
        System.out.println(shapeName);
    }
}
