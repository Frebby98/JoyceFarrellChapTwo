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
public class CarlysEventPrice {

    public static void main(String[] args) {
        final int PRICE_PER_PERSON = 35;
        boolean largeEventSize;
        System.out.println("Number of guests: ");
        Scanner input = new Scanner(System.in);
        int numberOfGuest = input.nextInt();
        largeEventSize = numberOfGuest > 50;

        System.out.println("***Carly’s makes the food that makes it a "
                + "party.*** \nNumber of guest = " + numberOfGuest
                + "\nPrice per guest = " + PRICE_PER_PERSON + "\nTotal price = "
                + numberOfGuest * PRICE_PER_PERSON + "\n"
                + "Is the event a large or small event? " + largeEventSize);

    }
}
