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
public class NauticalMilesInteractive {
    public static void main(String[] args){
    final double KILOMETRES_NUM = 1.852;
    final double MILES_NUM = 1.150779;
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Nautical miles to be converted to kilometres is >>> ");
    double nauticalMilesToKm = input.nextDouble();
    
    System.out.println("Nautical miles to be converted to Miles is >>> ");
    double nauticalMilesToMiles = input.nextDouble();
    
    double nauticalMilesToKmConvert = nauticalMilesToKm * KILOMETRES_NUM;
    double nauticalMilesToMilesConvert = nauticalMilesToMiles * MILES_NUM;
    
    System.out.println("Nautical Miles to km is = " + nauticalMilesToKmConvert +
            "\nNautical Miles to miles is = " + nauticalMilesToMilesConvert);

    
    
    }
}
