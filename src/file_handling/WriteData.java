package file_handling;

import java.io.File;
import java.io.IOException;

public class WriteData {
    public static void main(String[] args) {


        File a = new File("studentList.txt");

        try {
            a.createNewFile();

            Thread.sleep(5000);

            System.out.println("hello".charAt(22));
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            a.delete();
        }
        System.out.println("End of the program");
    }
}
