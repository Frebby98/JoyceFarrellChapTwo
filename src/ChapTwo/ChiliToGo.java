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
public class ChiliToGo {
         public static void main(String[] args){
             Scanner input = new Scanner(System.in);
             int adultMeals;
             int childrenMeals;
             
             adultMeals = 5;
             childrenMeals = 10;
             int total = adultMeals + childrenMeals;
             
             System.out.println("Total Adult meals = " + adultMeals + ".\n" +
             "Total Children meals = " + childrenMeals + ".\n" + 
                     "Total meals = " + total + ".");
             
             
         }
}
