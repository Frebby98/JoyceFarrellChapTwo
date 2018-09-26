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
public class InchesToFeet {
   public static void main(String[] args){
    //A foot equals 12 inches
    final int FOOT = 12;
    int inches = 54;
    
    int inchesToFeet = inches / FOOT;
    int inchesRemains = inches % FOOT;
    
    System.out.println("Inches Conversion of " + inches + " is " + inchesToFeet 
        + " feet and " + inchesRemains + " inches");
   }
        
    
}
