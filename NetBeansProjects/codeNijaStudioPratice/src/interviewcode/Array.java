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
public class Array {
    
    
    
    /*
    syntax  to declear array in java 
    dataType[]arr;
     dataType[]arr;
    instantiation of an Array in java;
     arrayRefVar = new datatype[size];
    
    */
     public static void main(String args[]){
         int a[] = new int[5];
         a[0] = 10;
         a[1] = 20;
         a[2] = 70;
         a[3] = 40;
         a[4] = 50;
         
         
         for(int i = 0; i<a.length; ++i)
             System.out.println(a[i]);
             
         
     }
    
    
}
