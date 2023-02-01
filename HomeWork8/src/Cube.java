public class Cube implements GraphicalEditor{
    @Override
    public String print() {
        return "Cube";
    }

    @Override
    public void print(ShapeName shapeName) {
        System.out.println(shapeName);

    }
}
