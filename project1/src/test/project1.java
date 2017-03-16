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
public class project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Init variables
        long x1=-10,y1=15,z1=25,n1=100;
        int x2=40,y2=-8,z2=-5,n2=50;
        float x3=3.14f,y3=1.5f,z3=2.5f,n3=10.15f;
        double x4=-10.123,y4=15.15,z4=25.25,n4=10.9;
        // Try to solve equations
        System.out.println("Init variables are:");
        System.out.printf("x = %d; y = %d; z = %d; n = %d\n",x1,y1,z1,n1);
        System.out.println("Solving first equation...");
        System.out.printf("Result is: %d\n",solve(x1,y1,z1,n1));
        System.out.println("Init variables are:");
        System.out.printf("x = %d; y = %d; z = %d; n = %d\n",x2,y2,z2,n2);
        System.out.println("Solving second equation...");
        System.out.printf("Result is: %d\n",solve(x2,y2,z2,n2));
        System.out.println("Init variables are:");
        System.out.printf("x = %f; y = %f; z = %f; n = %f\n",x3,y3,z3,n3);
        System.out.println("Solving third  equation...");
        System.out.printf("Result is: %f\n",solve(x3,y3,z3,n3));
        System.out.println("Init variables are:");
        System.out.printf("x = %f; y = %f; z = %f; n = %f\n",x4,y4,z4,n4);
        System.out.println("Solving fourth  equation...");
        System.out.printf("Result is: %f\n",solve(x4,y4,z4,n4));
        
    }
    
    public static long solve(long x, long y, long  z, long n){
        
        long result;
        result = x + (y - 100) * z / n; 
        
        return result;
    }
    
    public static int solve(int x, int y, int  z, int n){
        
        int result;
        
        result = (x - (50 + y * z) * n) + x; 
        return result;
    }
    
    public static float solve(float x, float y, float  z, float n){
    
        float result;
        
        result = x * (y / (z-1) + 555) - n ;
        return result;
    }
    
    public static double solve(double x, double y, double  z, double n){
        double result;
        
        result = -x / y + z * (n+1);
        return result;
    }
}
