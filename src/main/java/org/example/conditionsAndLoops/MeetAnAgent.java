package org.example.conditionsAndLoops;

import java.util.Scanner;

// Asks for an input number
// If the input equals to the secret password number, prints "Hello, Agent"
// Otherwise, prints "Access denied"
// Secret password is stored in final static int PASSWORD.
public class MeetAnAgent {
    final static int PASSWORD = 133976;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int inputPassword = in.nextInt();

        if (inputPassword == PASSWORD) {
            System.out.println("Hello, Agent");
        } else {
            System.out.println("Access denied");
        }
    }
}
