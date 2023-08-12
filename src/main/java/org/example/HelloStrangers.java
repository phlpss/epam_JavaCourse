package org.example;

// Please, proceed to HelloStrangers class and write a program that:
//  Asks for a number - amount of strangers to meet
//  Then reads stranger names line by line
//  And, finally, prints line by line "Hello, stranger name" for each stranger

// It is guaranteed that the input is not null. It is guaranteed that the input of strangers count is int number.
// Consider special cases:
//  If strangers count is zero, then program must print "Oh, it looks like there is no one here".
//  If strangers count is negative, then program must print "Seriously? Why so negative?".

import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int amountOfStrangers = in.nextInt();

        if(amountOfStrangers == 0) {
            System.out.println("Oh, it looks like there is no one here");
        } else if(amountOfStrangers < 0) {
            System.out.println("Seriously? Why so negative?");
        } else {
            // Consume the remaining newline character
            in.nextLine();
            String[] name = new String[amountOfStrangers];

            // Fill the name array with names
            for (int i = 0; i < amountOfStrangers; i++) {
                name[i] = in.nextLine();
            }
            // print out the greetings
            for (int i = 0; i < amountOfStrangers; i++) {
                System.out.println("Hello, " + name[i]);
            }
            in.close();
        }
    }
}
