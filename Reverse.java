/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse;

/**
 *
 * @author Fayi
 */
public class Reverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String x="Aplikasi";
        StringBuffer reverse;
        reverse=new StringBuffer(x);
        System.out.println(x);
        System.out.println(reverse.reverse());
    }
    
}
