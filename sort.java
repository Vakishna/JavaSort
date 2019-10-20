import java.lang.Math;
import java.util.Random;
import java.util.*;
import java.io.*;

public class sort {
    public static int[] BubbleGum(int[] arr) {
        int[] sortedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];

        }
        //DEBUGGING STEP
        System.out.println("Go"); 
        //PrintArr(sortedArr);
        //PrintArr(arr);
        for (int i = 0; i < sortedArr.length; i++) {
            for (int j = i + 1; j < sortedArr.length; j++) {
                if (sortedArr[i] > sortedArr[j]) {
                    // Declaring tempVar to store i value, as it will be assigned
                    // to i+1 first.
                    int tempVar;
                    tempVar = sortedArr[i];
                    sortedArr[i] = sortedArr[j];
                    sortedArr[j] =  tempVar;
                }
            } 
        }

        System.out.println(" ");

        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr[i]);
        }
    
        return sortedArr;

    }

    public static int inputGetter() {
        try {
            int num;
            System.out.println("Please an integer >= 0");
            System.out.print(">> ");
            Scanner numIO = new Scanner(System.in);
            num = numIO.nextInt();
            return num;
        } catch (InputMismatchException e) {
            //System.out.println("Error was encountered, while trying to read integer number" +
            //        "\nPlease verify correct input parameters and try again.");
            return 0;
        }
    }

    public static void PrintArr(int[] arrd) {
        System.out.println("[ ");
        for (int i = 0; i < arrd.length; i++) {
            System.out.print(", " + arrd[i]);
        }
        System.out.print(" ]\n");

    }

    public static void main(String[] args) {
        int min, max;
        min = 1;
        max = 10;
        //while (min <= 0 || max <= 0) {
        //    min = inputGetter();
        //    max = inputGetter();
        //}
        
        int[] randomArray = new int[15];
        
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * ((max - min)) + 1) - min; 
        }
        
        System.out.println("Unsorted Array ");
        PrintArr(randomArray);
        
        System.out.println("Sorted Array: ");
        
        int[] s = new int[15];
        s = BubbleGum(randomArray);
        PrintArr(s);
    }
}
