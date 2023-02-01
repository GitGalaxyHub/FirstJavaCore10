public abstract class Octagon implements GraphicalEditor{
    @Override
    public String print() {
        return "Octagon";
    }

    @Override
    public void print(ShapeName shapeName) {
        System.out.println(shapeName);

    }
}
