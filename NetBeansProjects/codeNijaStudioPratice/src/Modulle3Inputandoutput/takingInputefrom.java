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
public class takingInputefrom {
    
    public static void main(String arg[]){
        System.out.println("Student Records");
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your name");
        String str1 = sc.nextLine();
        
        System.out.println("please enter your address");
        String str2 = sc.nextLine();
        System.out.println("please enter your email");
        String str3 = sc.nextLine();
        System.out.println("please enter your phone number");
           long b = sc.nextLong();
       System.out.println("please enter your age");
        String str4 = sc.nextLine();
        System.out.println("please enter your Date of Birth");
        String str5 = sc.nextLine();
        System.out.println("please enter your hobby");
        String str6 = sc.nextLine();
        System.out.println("please enter your name of your school");
        String str7 = sc.nextLine();
     System.out.println("=================================================");   
        System.out.println(
        "Name:"+ str1+"\n"+
        "Adress:"+ str2+"\n"+
        "Eamil:"+ str3+"\n"+
        "Phone number"+ b +"\n"+
        "Age:"+ str4+ "\n" +
        "Date of Birth: "+ str5 +"\n"+
        "hobby: " + str6 +"\n"+
        "name of school"+ str7 );
       System.out.println("=================================================");
    }
    
}
