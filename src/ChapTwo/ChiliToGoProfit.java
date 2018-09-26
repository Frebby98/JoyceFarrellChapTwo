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
public class ChiliToGoProfit {
    public static void main(String[] args){
             Scanner input = new Scanner(System.in);
             float adultMeals;
             float childrenMeals;
             
             adultMeals = 4.35f;
             childrenMeals = 3.10f;
             float grandProfit = adultMeals + childrenMeals;
             
             System.out.println("Total Adult meals = " + adultMeals + ".\n" +
             "Total Children meals = " + childrenMeals + ".\n" + 
                     "Total meals = " + grandProfit + ".");
    }
}
