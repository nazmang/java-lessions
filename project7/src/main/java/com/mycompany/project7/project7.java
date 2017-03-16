/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project7;

import java.util.Arrays;

/**
 *
 * @author yevhen.nazarenko
 */
public class project7 {

    public static void main(String[] args) {
        //System.out.println(1 % 2);
        fillArray(5, 5);
    }

    public static void fillArray(int n, int m) {
        
        int[][] arr = new int[n][m];
        n=m;
        int val = 1;
        //  Fill left side of array
        for (int k = 1; k <= n; k++) {
//            System.out.println(k);
            if (k % 2 == 0) {
                for (int j = 0, i = k - 1; j < k; j++, i--) {
                    arr[i][j] = val;
                    val++;
//                    System.out.println("k=" + (k) + " i=" + (i + 1) + " j=" + (j + 1));
                }
            } else {
                for (int i = 0, j = k - 1; i < k; i++, j--) {
                    arr[i][j] = val;
                    val++;
//                    System.out.println("k=" + (k) + " i=" + (i + 1) + " j=" + (j + 1));
                }
            }
        }
        // Fill right side of array
        for (int k = m - 1, l = 1; k > 0; k--, l++) {
//            System.out.println(k);
            if (k % 2 == 0) {
                for (int i = m - 1, j = l; j < m; j++, i--) {
                    arr[i][j] = val;
                    val++;
//                    System.out.println("k=" + (k) + " i=" + (i + 1) + " j=" + (j + 1));
                }
            } else {
                for (int j = m - 1, i = l; i < m; j--, i++) {
                    arr[i][j] = val;
                    val++;
//                    System.out.println("k=" + (k) + " i=" + (i + 1) + " j=" + (j + 1));
                }
            }

        }
        // Print array
        for (int i=0; i < n; i++){
            for(int j=0; j < m; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
          
        }
    }

}
