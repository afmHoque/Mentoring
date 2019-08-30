package tryCatch;

public class Main {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 5;
            System.out.println(num1 / num2);
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
            System.out.println("Number 2 is a zero, plese enter a number grater than zero");
        }

    }
}
