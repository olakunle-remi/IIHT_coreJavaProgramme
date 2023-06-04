/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulle3Inputandoutput;

import java.util.Scanner;

/**
 *
 * @author Abiodun Olakunle
 */
public class tofindArearectagle {
    public static void main(String[]args){
        System.out.println("===========================================" );
        System.out.println("To calculate the area of a rectangle" );        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length ");
        int length = sc.nextInt();
        System.out.println("enter the breath");
        int breath = sc.nextInt();
        int area = length * breath;
        
        System.out.println("the area of the rectangle :" + area);
        
        System.out.println("===========================================" );
        
        System.out.println("To calcualte the area of circle");
        System.out.println("enter the value of radius of circle");
        float ar = sc.nextFloat();
        float areaCircle = (float) (ar * 3.142 * (ar));
        System.out.println("the area of cicle is :" + areaCircle);
        
        
         System.out.println("===========================================" );
        
        System.out.println("To calcualte the perimenter of  circle");
         System.out.println("enter the  value of radius only ");
        float r = sc.nextFloat();
        float perimeter = (float) (2 * 3.142 * (r));  
        System.out.println("the perimeter of a circle  is " + perimeter);
        
        
    }
    
}
