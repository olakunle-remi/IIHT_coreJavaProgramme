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
public class Light_chapter2 {
    public static void main(String[] arg){
        int lightspeed;
        long days;
        long seconds;
        long distance;
        // approximate sped of light in miles per seconds
        lightspeed = 1860000;
        days = 1000; // a speed of light numbers of days here
        seconds = days * 24 * 60 * 60; // convert to seconds
        distance = lightspeed *seconds; // compute distance
        System.out.println("In " + days);
        System.out.println("days light will travel about");
        System.out.println(distance +" miles");
              
    }
}
