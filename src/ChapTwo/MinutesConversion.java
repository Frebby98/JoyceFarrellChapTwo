/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapTwo;

import java.util.Scanner;

/**
 *
 * @author Frebby
 */
public class MinutesConversion {

    public static void main(String[] args) {
        final int anHourToMins = 60;
        final int aDayToMins = 1440;
        System.out.println("What minutes value would you like to convert");
        Scanner input = new Scanner(System.in);
        int minutes = input.nextInt();

        float hoursFromMins = minutes / anHourToMins;
        float daysFromMins = minutes / aDayToMins;

        System.out.println(minutes + " equals " + hoursFromMins
                + " hours and equals " + daysFromMins + "days");

    }

}
