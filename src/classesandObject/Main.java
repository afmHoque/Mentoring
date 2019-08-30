package classesandObject;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<String> departments = new ArrayList<>();
        departments.add("Computer Science");
        departments.add("Biology");
        departments.add("Philosophy");

        University nyu = new University("123",14,"New York University",departments);


    }
}
