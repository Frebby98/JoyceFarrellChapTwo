/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapTwo;

/**
 *
 * @author Frebby
 */
public class QuartsToGallons {
     public static void main(String[] args){
    final int NUM_OF_QUARTS_PER_GALLON = 4;
    int totalQuartsNeeded = 20;
    int total = totalQuartsNeeded / NUM_OF_QUARTS_PER_GALLON;
    
    System.out.println("A job that needs " + totalQuartsNeeded + " quarts "
            + "requires " + total + " gallons");
    
    }
}
