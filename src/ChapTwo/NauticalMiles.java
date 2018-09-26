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
public class NauticalMiles {
    public static void main(String[] args){
    final double KILOMETRES_NUM = 1.852;
    final double MILES_NUM = 1.150779;
    
    int nauticalMilesToKm = 45;
    int nauticalMilesToMiles = 34;
    
    double nauticalMilesToKmConvert = nauticalMilesToKm * KILOMETRES_NUM;
    double nauticalMilesToMilesConvert = nauticalMilesToMiles * MILES_NUM;
    
    System.out.println("Nautical Miles to km is = " + nauticalMilesToKmConvert +
            "\nNautical Miles to miles is = " + nauticalMilesToMilesConvert);

    
    
    }
}
