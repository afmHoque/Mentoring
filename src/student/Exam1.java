package student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Exam1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Imput number of students");
        ArrayList<String> stuName = new ArrayList<String>();
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println("Imput number of students");
            stuName.add(scanner.next());
            HashMap<String, Integer> marks = new HashMap<String, Integer>();

            System.out.println("Imput name of 1st Subject");
            String sub1 = scanner.next();
            System.out.println("Imput marks of the 1st subject");
            int mark1 = scanner.nextInt();
            marks.put(sub1, mark1);
            System.out.println("Imput name of 2nd subject");

            String sub2 = scanner.next();
            System.out.println("Imput marks of 2nd subject");
            int mark2 = scanner.nextInt();
            marks.put(sub2, mark2);
            System.out.println("Imput name of 3rd subject");

            String sub3 = scanner.next();
            System.out.println("Imput marks of 3rd subject");
            int mark3 = scanner.nextInt();
            marks.put(sub3, mark3);

            int total = mark1 + mark2 + mark3;
            System.out.println("Total mark is:" + total);
            System.out.println("Total mark is:" + total /3);


        }


    }


}
