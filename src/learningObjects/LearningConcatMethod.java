package learningObjects;

public class LearningConcatMethod {
    public static void main(String[] args){

        String variableName1 = "Tech";
        String variableName2 = "Global";


        String schoolName = "Tech" + "Global";  //+ operator
        String schoolName2 = variableName1.concat(variableName2); //concat method

        System.out.println(schoolName + "\n" + schoolName2);





    }
}
