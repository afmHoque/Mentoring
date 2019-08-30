package helloWorld;

import java.util.Scanner;

public class HelloWorld10Times {

    public static void main(String[] args) {


        for (int i = 1; i < 11; i++) {

            if (1 % 2 == 0) {
                System.out.println(i + "is an even numer");

                // System.out.println("Print Hello World 10Times: " + i);
            } else {
                System.out.println(i + "is an odd numer");
            }


        }

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number of rows ");
        int numOfRows = sc.nextInt();


        int numofRows = 5;
        for (int i = 1; i <= numofRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
