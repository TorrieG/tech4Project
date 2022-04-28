package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {
    public static void main(String[] args) {


        File a = new File("studentList.txt");

        try {
            a.createNewFile();

            Thread.sleep(5000);

            //Write some ifo to the file
            FileWriter file = new FileWriter("studentList.txt");
            file.write("Abe\n");
            file.write("Vita\n");
            file.write("Torrie\n");
            file.write("Taylor\n");
            file.write("Kanari");
            file.close(); // save

            Thread.sleep(5000);


        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            a.delete();
        }
        System.out.println("End of the program");
    }
}
