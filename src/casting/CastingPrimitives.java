package casting;

public class CastingPrimitives {
    public static void main(String[] args) {
        /*
        double> float > long > int > char > short > byte
        char doesn't have a negative value so must cast char
         */

        int myInt =32;
        long myLong = myInt;//implicit casting

        myInt = (int) myLong;//explicit casting

       int mySeocndInt = 'B';//implicit casting
       char myChar =(char) 56;
       char mySecondChar = 56;//you don't have to cast char and int
        int myThirdInt = (int)45.4;

        short myShort = (short)myChar;
        char myThirdChar=(char) myShort;

        byte num1=45;
        int num2 =num1;//implicit

        double num3 =13.6;
        float num4 = (float) num1;

        int num5 =45;
        short num6=34;

        char c = (char) num5;
        c = (char) num6;


    }
}
