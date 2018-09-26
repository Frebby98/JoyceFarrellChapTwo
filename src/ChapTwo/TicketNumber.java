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
public class TicketNumber {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            int ticketNumber = input.nextInt();
            int newTicket = ticketNumber%10;
            
            System.out.println("  new ticket "+newTicket);
            
            
            int ticketNumber2 = ticketNumber/10;
            
            System.out.println(ticketNumber2);
            
            int finalValue = ticketNumber2 % 7;
            
            System.out.println(finalValue);
            
            if (newTicket == finalValue){
                System.out.println("Ticket is valid");
                
            }else{
                System.out.println("Ticket is invalid");
            }
           // int processing = ticketNum / 7
            
            
            
        }
}
