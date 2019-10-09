/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanPBO1;

/**
 *
 * @author risaaa
 */
public class bolabalok {
    public static void main(String[] args) {
        System.out.println("Luas Permukaan Bola: "+Bola());
        System.out.println("Luas Permukaan Balok: "+Balok());

    }
    public static double Bola() {
        int r = 14;
        double phi = 22/7;
        double hasil = 4*phi*r*r;
        return hasil;
        
    }
    public static double Balok() {
        int p = 2;
        int l = 4;
        int t = 6;
        double hasil = 2 * (p*l + p*t + l*t);
        return hasil;
    }
}
    
    
    
    
       


        
        
        
        
        
    
   
   
       
       
      
    

