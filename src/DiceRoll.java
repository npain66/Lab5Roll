import java.util.Scanner;

/**
 * Created by Nicole on 2/3/2017.
 */
public class DiceRoll {
        public static void main(String[] args) {

            System.out.println("Welcome to the Casino!");

            //1. prompt user for the number sides of dice
            System.out.println("How many sides should each die have?");

            //2. get user input
            Scanner scan = new Scanner(System.in);
            int sides = scan.nextInt();

            String procede = "y"; //use for while loop to work
            while (procede.equals("y")) {

                //3. prompt user to roll the dice
                System.out.println("Press any number to roll");
                scan.next();

                //4. get user input
                System.out.println("Roll again?");

                //5. perform dice roll/ roll dice
                int result1 = (sides);//calling a method
                int result2 = (sides);//calling a method

                //6. Display results
                System.out.println("result1 = " + result1);
                System.out.println("result2 = " + result2);

                //7. prompt user to continue
                System.out.println("Would you like to continue y/n?");
                procede = scan.next();
            }
        }

    public static int roll(int max) {
        //generate random number here ans assign to number variable
        int n = (int) ((Math.random() * max) + 1);
        return n;
    }








    }



