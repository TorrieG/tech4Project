package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) {

        File x = new File("shoppingList.txt");

        try {
            x.createNewFile();
            Thread.sleep(5000);

            FileWriter y = new FileWriter("shoppingList.txt");
            y.write("Ice-cream\n");
            y.write("Fruits\n");
            y.write("Pen\n");
            y.write("Paper\n");
            y.write("Milk");
            y.close();
            Thread.sleep(1000);

            Scanner input = new Scanner(x);
            int k = 1;
            while (input.hasNextLine()){
                System.out.println("Item "+ (k++) +" = "+ input.nextLine());
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            x.delete();
        }
    }
}
