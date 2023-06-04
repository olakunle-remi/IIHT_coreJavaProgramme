/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacomplete.reference2023Chapterone;

/**
 *
 * @author Abiodun Olakunle
 */
public class ifstatementA {
    public static void main(String arg[]){
        
    
    int x, y;
    x  = 10;
    y = 20;
    
    if(x<y)System.out.println("x is less than y");
    x=x*2;
    if(x<y)System.out.println("x is less than y");
    x = x*2;
if(x<y)System.out.println("x is now  greater than y");    
if(x == y)System.out.println("you wont see this");
  }
}