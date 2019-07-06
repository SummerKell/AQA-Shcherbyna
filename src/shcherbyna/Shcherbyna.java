/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shcherbyna;

import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 *
 * @author notebook
 */
public class Shcherbyna {

    /**
     * @param args the command line arguments
     * @throws java.io.UnsupportedEncodingException
     */
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println("Task 1");
        System.out.println(task1());
        System.out.println("");
        System.out.println("Task 2");
        System.out.println(task2());
        System.out.println("");
        System.out.println("Task 3");
        task3();
    }

    public static String task1() {
        String answer;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number, please. Use a comma as a separator between the integer and fractional parts.");
        if (in.hasNextFloat()) {
            if (in.nextFloat() > 7) {
                answer = "Hello";
            } else {
                answer = "This number is less than 7";
            }
        } else {
            answer = "You don't enter a number or use the wrong format. Please, try again.";
        }
        return answer;
    }

    public static String task2() throws UnsupportedEncodingException {
        String answer;
        Scanner in = new Scanner(new InputStreamReader(System.in, "cp1251"));
        System.out.println("Enter the name, please.");
        if (in.nextLine().equals("Вячеслав")) {
            answer = "Hello, Вячеслав";
        } else {
            answer = "No such name. Please, try again.";
        }
        return answer;
    }

    public static void task3() {
        int size;
        System.out.println("Enter the array length: ");
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            size = in.nextInt();
            float newArray[] = new float[size];
            System.out.println("Enter the array of numbers, please.");
            Scanner in1 = new Scanner(System.in);
            for (int i = 0; i < size; i++) {
                System.out.print("array[" + i + "]=");
                if (in1.hasNextFloat()) {
                    newArray[i] = in1.nextFloat();
                } else {
                    System.out.println("You enter not a number.Please try again.");
                    break;
                }
            }
            task3Check(newArray);
        } else {
            System.out.println("It is not an integer number. Please try again.");
        }
    }

    public static void task3Check(float[] array) {
        System.out.println("Multiples of three: ");
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 3 == 0) && (array[i] != 0)) {
                System.out.println(array[i]);
            }
        }
    }
}
