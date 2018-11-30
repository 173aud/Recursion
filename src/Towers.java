/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feli8871
 */
import TerminalIO.*;

public class Towers {
    static int nummoves=0;
    
    public static void main(String[] args){
        KeyboardReader k=new KeyboardReader();
        int numrings=k.readInt("Enter the number of Rings: ");
        if(numrings<3||numrings>10){
            System.out.println("Invalid input - program will now end.");
            return;
        }
        
        // Call move - requires number of rings, going from where to where as well as which ring is the in-between step
        move(numrings,1,3,2);
        System.out.println("Total moves="+nummoves);
        
        
    }
    
    public static void move(int n,int i,int j,int k){
        // Stop moving rings when there are no rings to move
        if(n>0){
            nummoves++;
            move(n-1,i,k,j); // Move calls itself (note that j&k are reversed
            System.out.println("Move ring "+n+" from peg "+i+" to peg "+j+".");
            // move calls itself again - back from k to j
            move(n-1,k,j,i);
        }
    }
    
    
    
}
