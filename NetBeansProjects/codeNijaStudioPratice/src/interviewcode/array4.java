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
public class array4 {
    public static void main(String args[]){
        int arr[][] = {{1,2,4},{4,5,6},{7,8,9}};
        for (int i=0; i<3; i++){
            for(int j=0; j<3; ++j){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
