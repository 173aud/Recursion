/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feli8871
 */
public class Simpsons {
    
    /**
     * @param args the command line arguments
     */
    
    static String start[]={"Simpsons in Cave", "Lisa Trapped with Burns", "Burns at Moe's", "Moe with Edna","Edna in School"};
    
    static String end[]={"Simpsons leave Cave","Lisa takes picture with Burns", "Burns gets Gold", "Moe puts gold in Machine","Edna stays on as a Teacher"};
    
    
    public static void main(String[] args) {
        Story(0);
        
        
    }
    
    public static void Story(int n){
        System.out.println(start[n]);
        if(n<4){
            Story(n+1);
        }
        System.out.println(end[n]);
        
    }
    
    
}
