/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author yevhen.nazarenko
 */
public class project3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double x = 19, y = 0.3, z = -9.6;
        System.out.printf("Coordinates are: x = %f; y = %f; z = %f;\n", x,y,z);
        System.out.printf("Vector length is: %f\n", VectorLength(x,y,z));
    }
 
    public static double VectorLength(double x, double y, double z){
        
        double length;
        
        length = Math.sqrt(x*x + y*y + z*z);
        
        return length;        
    }
    
}
