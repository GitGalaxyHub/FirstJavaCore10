 class Quad implements GraphicalEditor{

    @Override
    public String print() {
        return "Quad";
    }

    @Override
    public void print(ShapeName shapeName) {
        System.out.println(shapeName);
    }
}