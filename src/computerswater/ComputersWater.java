/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package computerswater;

/**
 *
 * @author gasco1246
 */
import java.util.Scanner;
public class ComputersWater {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        Scanner keyInput = new Scanner(System.in);
        
        //variable declaration
        double numMon, numCom, water, waterBottles;
        
        System.out.println("Type the number of monitors you own");
        numMon = keyInput.nextDouble();
        
        System.out.println("Type the number of computers you own");
        numCom = keyInput.nextDouble();
        
        water = numMon*0.5 + numCom * 1.0;
        waterBottles = water*1000*2;
        System.out.println(water+" tons of water were used to make those devices");
        System.out.println("That's "+waterBottles+" half liter water bottles");
        
        
       
       
    }
    
}
