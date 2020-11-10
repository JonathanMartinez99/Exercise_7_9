package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        double notesSummatory=0, numberCounter=0, userNote, notesAverage;
        String endCheck;

        System.out.println("Insert a mark: ");
        endCheck = scan.nextLine();

        while(!endCheck.equals("end"))
        {
            userNote = Double.parseDouble(endCheck);
            numberCounter++;
            notesSummatory += userNote;
            System.out.println("Insert a mark: ");
            endCheck = scan.nextLine();
        }

        if (numberCounter != 0)
        {
            notesAverage = notesSummatory / numberCounter;
            System.out.println("The average is : " + notesAverage);
        }
    }
}
