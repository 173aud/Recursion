
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feli8871
 */
public class countPairs {

    /**
     * @param args the command line arguments
     */
    ArrayList<String> testdata; // Data being sent (stored as int)
    ArrayList<Integer> expected; // Expected Results
    public String id;
    
    public static void main(String[] args) {
        ArrayList<String> in=new ArrayList();
        ArrayList<Integer> out=new ArrayList();
        // INPUT test data
        in.add("ax"); in.add("axa"); in.add("ybbyb");
        in.add("axaxa"); in.add("xaxa"); in.add("");
        in.add("xxx"); in.add("axaxaxaxaxxa"); in.add("a");
        // OUTPUT expected results
        out.add(0); out.add(1); out.add(1);
        out.add(3); out.add(2); out.add(0);
        out.add(1); out.add(8); out.add(0);
        // Formulate the problem
        countPairs prob=new countPairs(in,out,"countPairs");
        // TEST the data
        prob.test();
    }
    
    public countPairs(ArrayList<String> str, ArrayList<Integer> ex, String i){
        testdata=str;
        expected=ex;
        id=i;
    }
    
    public int solve(String str){
        if(str.length()<=2) return 0;
        if(str.charAt(0)==str.charAt(2)) return 1 + solve(str.substring(1));
        else return 0 + solve(str.substring(1));
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
