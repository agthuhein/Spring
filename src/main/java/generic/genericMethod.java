package generic;

public class genericMethod {
    public static void main(String[] args) {
        print(10);
        print("Aung Thu Hein");
        print(3.142f);
        print(123330.30);
    }
    public static <T> void print(T whatToPrint){
        System.out.println(whatToPrint);
    }
}
