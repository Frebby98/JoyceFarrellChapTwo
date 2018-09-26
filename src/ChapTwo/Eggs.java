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
public class Eggs {
    public static void main(String[] args){
        //This is for dollars
        final double dozenEggsCharge = 3.25;
        //This is for cents
        final int eggsOutOfDozen = 45;
        final int dozenEggsNum = 12;
        Scanner input = new Scanner(System.in);
        System.out.println("Number of eggs please?>>> ");
        int totalEggs = input.nextInt();
        int upToDozenEggs = totalEggs / dozenEggsNum;
        int notUpToDozen = totalEggs % dozenEggsNum;
        int calcEggsRemains = eggsOutOfDozen * notUpToDozen;
        int RemainDollarsCalc = calcEggsRemains / 100; 
        int remainCentsCalc = calcEggsRemains % 100;
        
        System.out.println("You ordered " + totalEggs + " eggs. That’s " +
        upToDozenEggs + " dozen at $ " + dozenEggsCharge + " per dozen and " + 
                notUpToDozen + " loose eggs at " + eggsOutOfDozen + " cents each" +
                        " for a total of " + calcEggsRemains + " cents." +
        "which is equivalent to " + RemainDollarsCalc + " dollars and " +
                remainCentsCalc + " cents" );
        
        
    }
}
