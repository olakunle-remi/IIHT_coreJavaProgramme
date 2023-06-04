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
public class array3 {
    // passing array to method
     static void  min(int arr[]){
         int min = arr[0];
         for(int i = 1; i<arr.length; ++i)
             if(min>arr[i])
                 min = arr[i];
         System.out.println(min);
     }
     public static void main(String arg[]){
         int a[]= {33,3,4,5};
         min(a); // passing array to method
     }
    
}
