package generic;

public class Printer <T>{
    T whatToPrint;

    public Printer(T whatToPrint) {
        this.whatToPrint = whatToPrint;
    }

    public void print() {
        System.out.println(whatToPrint);
    }
}
