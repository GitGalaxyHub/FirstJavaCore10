public class Shape {
    private String printName;

    public Shape() {
    }

    public Shape(String printName) {
        this.printName = printName;
    }

    public String getPrintName() {
        return printName;
    }

    public void setPrintName(String printName) {
        this.printName = printName;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "printName='" + printName + '\'' +
                '}';
    }
}
