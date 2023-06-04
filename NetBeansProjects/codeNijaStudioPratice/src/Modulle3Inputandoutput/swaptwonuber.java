/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulle3Inputandoutput;

/**
 *
 * @author Abiodun Olakunle
 */
public class swaptwonuber {
public static void main(String[] args){
    int a = 10; 
    int b = 20;
    System.out.println("Before swapping value are....." +a+ " "+ b);
    
    // logic third variable
    /*int t=a;
    a=b;
    b=t;*/
    // logic  without using third variable
    /* a=a+b; //10 + 20 = 30
    b=a-b; //30-20 =10
    a=a-b; // 30 - 10 =20*/
    // logic3 - use * and / without using third variable
    //System.out.println("After swapping values are ...."+a + " "+ b);
    
    a = a*b; //10*20= 200
    b = a/b;  //200/20 =10
    a = a/b; // 200/10=20
    
    
    
    System.out.println("After Swapping values are....." +a + " "+ b);
}    


}
