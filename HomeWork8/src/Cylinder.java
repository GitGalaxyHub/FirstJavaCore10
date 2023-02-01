public class Cylinder implements GraphicalEditor{
    @Override
    public String print() {
        return "Cylinder";
    }

    @Override
    public void print(ShapeName shapeName) {
        System.out.println(shapeName);

    }
}
