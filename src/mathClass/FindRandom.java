package mathClass;

public class FindRandom {
    public static void main(String[] args) {

        /*
        random number 67-85 and print out
        number1 and number2 and max and min

        (big - small + 1) + start

         */
        int random1 = (int)(Math.random() * 19 + 67);
        int random2 = (int)(Math.random() * 19 + 67);

        System.out.println("\n\nFirst number is = " + random1 +
                "\nSecond number is = " + random2 +
                "\nMax of two numbers is = " + Math.max(random1, random2) +
                "\nMin of two numbers is = " + Math.min(random1, random2));


        /*
        Random number between 45-98
         */

        System.out.println((int)(Math.random()*54)+45);


        double random = Math.random();
        System.out.println(random+4);
        double random0And10Included = Math.random();
        int random0And10Included2 = (int) (Math.random()*11);
        int random0And10Included3 = (int) (Math.random()*21);
        int random10And20Included = (int) (Math.random()*11)+10;
        System.out.println(random0And10Included);
        System.out.println(random0And10Included2);
        System.out.println(random0And10Included3);
        System.out.println(random10And20Included);

        //create a random number between 103 - 346 included take that as an int
        // get the difference between start point and end point --> 346 - 103  = 243 add +1
        // multiply it by 243 + 1 = 244
        // add the starting point to the equation
        //random * (end point - start point + 1) + start point

        int random103And246Included =(int)(Math.random()*244) + 103;
        System.out.println(random103And246Included);

        //create a random number between -50/50 included take that as an int
        //random * (end point - start point + 1) + start point
        // random *(50 - (-50) + 1))-50

        int random_50And50Included = (int)(Math.random()*101)-50;
        System.out.println(random_50And50Included);

         /*
        Create a program which is generating two random numbers between 67 - 85
        and print it out the number12 and number22 and max and min.
         */

        int random12 = (int)(Math.random() * 19 + 67);
        int random22 = (int)(Math.random() * 19 + 67);

        System.out.println("\n\nFirst number is = " + random12 +
                "\nSecond number is = " + random22 +
                "\nMax of two numbers is = " + Math.max(random12, random22) +
                "\nMin of two numbers is = " + Math.min(random12, random22));
    }
}
