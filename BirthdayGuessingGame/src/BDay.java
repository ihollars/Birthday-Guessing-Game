/*
Name: Isaiah Hollars
Date Due: August 31st
Assignment: Birthday Guessing Game
Course Section: 2
Professor Gaines Programming 2
 */


import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class BDay {

    public static void main(String[] args) {

        //Set up the different cards

        String card0 = "----------------\n" + "| 1   3   5   7|\n| 9  11  13  15|\n|17  19  21  23|\n|25  27  29  31|" + "\n----------------";
        String card1 = "----------------\n" + "| 2   3   6   7|\n|10  11  14  15|\n|18  19  22  23|\n|26  27  30  31|" + "\n----------------";
        String card2 = "----------------\n" + "| 4   5   6   7|\n|12  13  14  15|\n|20  21  22  23|\n|28  29  30  31|" + "\n----------------";
        String card3 = "----------------\n" + "| 8   9  10  11|\n|12  13  14  15|\n|24  25  26  27|\n|28  29  30  31|" + "\n----------------";
        String card4 = "----------------\n" + "|16  17  18  19|\n|20  21  22  23|\n|24  25  26  27|\n|28  29  30  31|" + "\n----------------";

        //put the cards in an array to iterate through
        String[] cardArr = {card0,card1,card2,card3,card4};


        Scanner scan = new Scanner(System.in);
        boolean playAgain = true;

        //birthdayNumber will store the the number value for the user's birthday
        int birthdayNumber = 0;

        //This is a greeting message
        System.out.println("\n \n \n \n \n");
        System.out.println("Welcome to the birthday guessing game.\n This game guesses the day you were born on \n(not the month/year)\n Answer the following questions and prepare to be amazed!!");

        while (playAgain){
         //This loop loops through the card list and adds to the birthdayNumber for "yes" answers
            for (int i = 0; i < 5; i++) {
                System.out.println("\n \n \n \n \n");
                System.out.println("card #"+i);
                System.out.println( cardArr[i] );
                System.out.println("Is your birthday on this card?\n Enter \"yes\" OR \"no\" and then hit Enter");
                String res = scan.nextLine();
                if (res.toLowerCase().trim().equals("yes")) {
                    birthdayNumber += Math.pow(2 , i);

                }
            }

            //prints the solution (and checks to see if person answered)
            if(birthdayNumber != 0) {
                System.out.println("\n \n \n \n \n");
                System.out.println("***********************************************");
                System.out.println("I, the all knowing computer,\n believe your birthday is on day: " + birthdayNumber);
                System.out.println("***********************************************");
            }
            else {
             System.out.println("The computer doesn't know...because you lied!");
            }
            System.out.println("Would you like to play again?");
            System.out.println("Enter \"yes\" OR \"no\" and then hit Enter");
            String res = scan.nextLine();
            if (res.toLowerCase().trim().equals("yes")) {
                playAgain = true;
                birthdayNumber = 0;
            }
            else{
                System.out.println("Thanks for playing!");
                playAgain = false; }

            }
        }
    }

