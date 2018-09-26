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
public class QuartsToGallonsInteractive {
     public static void main(String[] args){
    final int NUM_OF_QUARTS_PER_GALLON = 4;
    int totalQuartsNeeded;
      
    System.out.println("Give a number for conversion>>>");

    
    Scanner input = new Scanner(System.in);
    totalQuartsNeeded = input.nextInt();
    
     int totalGallons = totalQuartsNeeded / NUM_OF_QUARTS_PER_GALLON;
     int remainingQuarts = totalQuartsNeeded % NUM_OF_QUARTS_PER_GALLON;
     
    System.out.println("A job that needs " + totalQuartsNeeded + " quarts "
            + "requires " + totalGallons + " gallons " + remainingQuarts +
            " quarts remaining");
    }
}
