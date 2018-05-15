/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

/**
 *
 * @author ghost
 */
public class BubbleSort {
    
    public static void bubbleSrt(int[] array){
        int n = array.length;
        int k;
        for (int m = 0; m < n; m++) {
            for (int j = 0; j < n-1; j++) {
                k = j + 1;
                if (array[j] > array[k]) {
                    swapNumber(j, k, array);
                }
            }
            printNumbers(array);
        }
    }
    
    private static void swapNumber(int i, int j, int[] array){
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    private static void printNumbers(int[] input){
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] input = {4, 2, 9, 6, 23, 12, 34, 0, 1};
        bubbleSrt(input);
    }
    
}
