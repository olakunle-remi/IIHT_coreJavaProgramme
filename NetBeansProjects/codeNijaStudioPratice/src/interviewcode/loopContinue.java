/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewcode;

/**
 *
 * @author Abiodun Olakunle
 */
public class loopContinue {
    public static void main(String arg[]) {
        int[] numbers = { 10, 20, 30, 40, 50};
        
        for(int x : numbers){
            if(x==30){
                continue;
            }
            System.out.println( x);
        }
        System.out.print("\n");
    }
    
}
