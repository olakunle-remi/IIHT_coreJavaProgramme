/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulle3Inputandoutput;

import java.util.Scanner;

/**
 *
 * 
 * @author Abiodun Olakunle
 * codingninjas.com practice
 * Date:23 Jan 2023
 * Time: 1:09PM
 * program: simple calculator
 * using scanner method to input value from user
 */
public class talkinginputfromUseB {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number ");
        int b = sc.nextInt();
        int add = a + b;
        int sub = a - b;
        int div = a/b;
        int mod = a%b;
        int mul= a*b;
        
        System.out.println("sum = " + add + "differece = "+ sub + "division = " + div +"mul = "+ mul +" mod = "+ mod);
        
                
        
        
        
    }
    
}
