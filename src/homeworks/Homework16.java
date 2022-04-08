package homeworks;

public class Homework16 {

    //TASK-1
    public static int countWords(String str){
        int a = 0;
        String[] string = str.trim().split(" ");
        for (String element : string) {
            if (element.isEmpty())break;
            a++;
        }
        return a;
    }




    public static void main(String[] args) {
        String str = "     Java is fun       ";
        System.out.println(countWords(str));



    }
}
