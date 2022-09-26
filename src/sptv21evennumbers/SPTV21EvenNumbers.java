/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv21evennumbers;

import static java.lang.Math.round;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Anatoli
 */
public class SPTV21EvenNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = new int[20];
        int sum = 0;
        int avg = 0;
        Random randNum = new Random();
            for (int i = 0; i < 20; i++) {
                arr[i] = randNum.nextInt(20);
                sum += arr[i];
                avg = sum/20;
                
            }
            System.out.println("Random numbers = "+Arrays.toString(arr));
            System.out.println("Sum of numbers = "+sum);
            System.out.println("Avg of numbers = "+round(avg));
    }
    
}
