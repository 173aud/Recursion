/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feli8871
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x=factorial(7);
        System.out.println("7!="+x);
    }
    
    public static int factorial(int n){
        if(n==1||n==0) return 1;
        else {
            System.out.println("Calling factorial for #"+(n-1));
            return n*factorial(n-1);
            
        }
    }
    
    
    
    
    
    
}
