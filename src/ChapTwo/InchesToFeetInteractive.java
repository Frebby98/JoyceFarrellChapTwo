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
public class InchesToFeetInteractive {
    public static void main(String[] args){
    //A foot equals 12 inches
    final int FOOT = 12;
   
    System.out.println("Number for inch conversion is >>> ");
    Scanner input = new Scanner(System.in);
    double inches = input.nextDouble();
    
    double inchesToFeet = (int)inches / FOOT;
    double inchesRemains = inches % FOOT;
    
    System.out.println("Inches Conversion of " + inches + " is " + inchesToFeet + 
        " feet and " + inchesRemains + " inches");
   }
}
