package dataReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;

public class Main {

    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        String fileName = "C:\\Mentoring\\src\\dataReader\\Sample.txt";

        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);


            String data = "";
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("File was not found");
        } finally {
            try {
                br.close();
                fr.close();
            } catch (Exception ex2) {

            }
        }
    }

}
