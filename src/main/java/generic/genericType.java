package generic;

public class genericType {
    public static void main(String[] args) {
        Printer<Float> floatPrinter = new Printer<>(3.14f);
        floatPrinter.print();

        Printer<Double> doublePrinter = new Printer<>(122.30);
        doublePrinter.print();

        Printer<String> stringPrinter = new Printer<>("Hello World");
        stringPrinter.print();
    }
}
