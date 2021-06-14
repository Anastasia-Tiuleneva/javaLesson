package Lesson3;

import javax.swing.*;
import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {
        int[] mas = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(mas));
        for (int i = 0; i < mas.length; i++) {
            if (mas[i]==1) {
                mas[i]=0;
            }
            else if (mas[i]==0) {
                mas[i]=1;
            }
        }
        System.out.println(Arrays.toString(mas));
        int [] port = new int [100];
        for (int i =0; i < 100; i++) {
            port [i] = i + 1;
        }
        System.out.println(Arrays.toString(port));
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));

        int [][] table = new int [5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++){
                if (i==j || i+j==4 ) {
                   table [i][j] = 1;
                }
            }
        }
        printArr(table);
        int[] massiv = masArr(6, 7);
        System.out.println(Arrays.toString(massiv));

        int[] search = {1,3,5,7,9,90,0};
        int minElement = search[0];
        int maxElement = search[0];
        for (int i = 0; i < search.length; i++) {
            if (search[i] > maxElement) {
                maxElement = search[i];
            }
            if (search[i] < minElement) {
                minElement = search[i];
            }
        }
        System.out.println(minElement);
        System.out.println(maxElement);
        

    }
    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static int[] masArr (int len, int initialValue) {
        int[] massiv = new int [len];
        for (int i = 0; i < len; i++) {
            massiv[i] = initialValue;
        }
        return massiv;

    }


}

    


