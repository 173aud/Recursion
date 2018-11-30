/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feli8871
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("The 12th Fibonacci number is: "+fibonacci(12));
        System.out.println("The 3rd Fibonacci number is: "+altfibonacci(3));
    }
    
    public static int fibonacci(int n){
        if(n==1||n==2) return 1;
        else return fibonacci(n-1)+fibonacci(n-2);
    }
    
    public static int altfibonacci(int n){
        if(n==1||n==2) return 1;
        int n1=1,n2=2, counter=2;
        while (true){
            int fibonaccinum=n1+n2;
            counter++;
            if(counter==n) return fibonaccinum;;
            n1=n2;
            n2=fibonaccinum;
        }
        
    }
    
    
}
