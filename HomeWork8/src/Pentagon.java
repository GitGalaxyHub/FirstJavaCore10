public class Pentagon implements GraphicalEditor{
    @Override
    public String print() {
        return "Pentagon";
    }

    @Override
    public void print(ShapeName shapeName) {
        System.out.println(shapeName);

    }
}
