/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feli8871
 */

import java.util.*;

public class array11 {

    /**
     * @param args the command line arguments
     */
    
    ArrayList<int[]> testdata;
    ArrayList<Integer> expected;
    public String id;
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public array11(ArrayList<int[]> x, ArrayList<Integer> ex, String i){
        testdata=x;
        expected=ex;
        id=i;
    }
   
    public int solve(int[] nums, int index) {
        if(index<0) return 0;
        if(index==nums.length) return 0;
        else if(nums[index]==11) return 1+solve(nums, index+1);
        else return 0+solve(nums,index+1);
}
    
    
    
}
