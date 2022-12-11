package ru.mirea.l8;

import java.util.Scanner;

public class Task17 {
    public int recursion() {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int max = N;

        if(N == 0) {
            return max;
        }

        max = Math.max(recursion(), N);

        return max;
    }

    public static void main(String[] args) {
        Task17 maxSet = new Task17();
        System.out.println(maxSet.recursion());
    }
}