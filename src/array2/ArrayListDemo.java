package array2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ArrayListDemo {
    public static void main(String[] args) {

        try {
            ArrayList<Integer> arrayList = new ArrayList<>();

            Random rand = new Random();

            for (int i = 0; i < 100; i++) {
                arrayList.add(rand.nextInt(i));
            }

            for (int i = 0; i < 100; i++) {
                System.out.println(arrayList.get(i));

                Iterator iterator = arrayList.iterator();
                while (iterator.hasNext());
                System.out.println();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
