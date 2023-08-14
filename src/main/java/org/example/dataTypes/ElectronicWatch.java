package org.example.dataTypes;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        // 89999
        Scanner scanner = new Scanner(System.in);
        int inputSeconds = scanner.nextInt();

        int hours = inputSeconds / 3600;
        if (hours == 24) {
            hours = 0;
        }
        int minutes = (inputSeconds % 3600) / 60;
        int seconds = inputSeconds % 60;

        String formattedTime = String.format("%d:%02d:%02d", hours, minutes, seconds);
        System.out.println(formattedTime);
    }
}
