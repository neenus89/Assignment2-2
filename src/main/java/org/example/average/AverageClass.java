package org.example.average;
import java.util.Scanner;

public class AverageClass {
    public  static void main(String [] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements that you want to store");
        int length = sc.nextInt();
        System.out.println("Enter the elements :");
        int i=0;
        int[] array = new int[length];
        for(i = 0; i < length; i++){
            array[i] = sc.nextInt();
        }
        int sum = 0;
        for (int num: array) {
            sum = sum+num;
        }
        float average = sum/length;
        System.out.println("Average of numbers :"+average);

    }
}
