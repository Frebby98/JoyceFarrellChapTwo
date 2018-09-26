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
public class RandomGuessMatch {
    public static void main(String[] args){
       
    int random = 1 + (int)(Math.random() * 5);
    Scanner input = new Scanner(System.in);
    System.out.println("Choose a number >>> ");
    int choice = input.nextInt();
    boolean compare = choice == random;
    
    System.out.println("You chose " + choice + "." +
            "random number is " + random + "\n" +
            "Choice: " + choice + " is " + compare);
    
    
    
    
    
    }
}
