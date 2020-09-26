package ru.mirea;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int size = scanner.nextInt();
        int[] nums = new int[size];
        System.out.print("Enter elements: ");

        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += nums[i];
        }
        System.out.println("For sum: " + sum);

        int i = 0;
        sum = 0;
        while (i < size) {
            sum += nums[i];
            i++;
        }
        System.out.println("While sum: " + sum);

        i = 0;
        sum = 0;
        do {
            sum += nums[i];
            i++;
        } while (i < size);
        System.out.println("Do while sum: " + sum);
    }
}
