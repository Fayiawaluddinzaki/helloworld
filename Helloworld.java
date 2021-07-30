/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author Fayi
 */
//import java.util.Scanner;
public class Helloworld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=50;
        int i;
        
            for(i=1;i<=x;i++){
            if (i%3==0 && i%5==0){
             System.out.println("Hello World");   
            }
            else if (i%3==0){
                System.out.println("Hello");
            }
            else if (i%5==0){
                System.out.println("World");
            }
            else{
                System.out.println(i);
            }
        }
    }
    
}
