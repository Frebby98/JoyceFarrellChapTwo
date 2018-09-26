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
public class SammysRentalPrice {
    public static void main(String[] args){
        final int RENTAL_COST_PER_HOUR = 40; 
        final int minsMakeAnHour = 60;
        final int ADDITIONAL_MINS = 1;
        double totalPrice;
        int hours;
        int additionalMins;
        double minsRented;
        double finalPrice;
        
        System.out.println("Minutes rented >>> ");
        Scanner input = new Scanner(System.in);
        minsRented = input.nextDouble();
        hours = (int) minsRented / minsMakeAnHour;
        additionalMins = (int) minsRented % minsMakeAnHour;
        totalPrice = hours * RENTAL_COST_PER_HOUR;
        finalPrice = totalPrice + additionalMins;
                
        System.out.println("SSSSSS Sammy’s makes it fun in the sun SSSSS\n" +
                "Hours = " + hours + " hours\n Minutes = " + additionalMins +
                " minutes.\n" + "Total price is " + finalPrice);
    
        
}
}