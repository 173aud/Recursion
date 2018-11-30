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

public class BunnyEars {
    
    ArrayList<Integer> testdata; // Data being sent (stored as int)
    ArrayList<Integer> expected; // Expected Results
    String id;
    
    public static void main(String args[]){
        ArrayList<Integer> in=new ArrayList();
        ArrayList<Integer> out=new ArrayList();
        // INPUT test data
        in.add(0); in.add(1); in.add(2);
        in.add(3); in.add(4); in.add(5);
        in.add(12); in.add(50); in.add(234);
        // OUTPUT expected results
        out.add(0); out.add(2); out.add(4);
        out.add(6); out.add(8); out.add(10);
        out.add(24); out.add(100); out.add(468);
        // Formulate the problem
        BunnyEars prob=new BunnyEars(in,out,"BunnyEars");
        // TEST the data
        prob.test();
        
    }
    
    public BunnyEars(ArrayList<Integer> a1,ArrayList<Integer> ex, String name){
        testdata=a1;
        expected=ex;
        id=name;
    }
    
    // The Method that Solves the Problem
    public int solve(int b){
        if(b==0){
            return 0;
        }
    else return 2+solve(b-1);
    }
    
    public void test(){
        System.out.println("Expected\t\tRun\tResult");
        System.out.println("==============================");
        for (int i = 0; i < testdata.size(); i++) {
            String output=id+"("+testdata.get(i)+") - "+expected.get(i);
            System.out.print(String.format("%-25s",output));
            int result=solve(testdata.get(i));
            String status=result==expected.get(i)? "SUCCESS":"FAIL";
            System.out.println(result+"\t"+status);
        }
    }
    
}
