//My program asks the user how many eggs they
//have and then tells the user how many dozen eggs they have and how many extra
//eggs are left over.
//```
//How many eggs do you have?  13
//Your number of eggs is 1 dozen and 1
import java.util.*;
public class Dozens {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("How may eggs do you have? ");
        int eggs = sc.nextInt();
        int dozen = eggs/12;
        int extra_eggs;


        //System.out.println(dozen);
        int eggs_on_hand = 0;
        eggs_on_hand = eggs - 12;


        if (dozen != 0 )
        {
            System.out.print("Your number of eggs is 1 dozen and " + eggs_on_hand);
        }

        else {

            System.out.println("You have less than a dozen of eggs");

        }



    }

}
