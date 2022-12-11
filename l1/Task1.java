package ru.mirea.l1;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 6, 45, 6, 7, 67};
        int sum = 0;

        for(int num : arr) {
            sum += num;
            System.out.println(num);
        }

        System.out.println(sum);
        System.out.println(sum / arr.length);
    }
}