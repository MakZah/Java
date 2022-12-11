package ru.mirea.l8;

public class Task14 {
    int power = 5;
    public void recursion(int N) {
        if(N <= 0) {
            System.out.println("end");
            return ;
        } else if(N/Math.pow(10, power) < 1) {
            power--;
            recursion(N);
        } else {
            System.out.println((int) (N/Math.pow(10, power)));
            if(N == (int) (N/Math.pow(10, power)) * Math.pow(10, power) && N > 9) {
                System.out.println(0);
            }
            N = (int) (N - (int) (N/Math.pow(10, power)) * Math.pow(10, power));
            recursion(N);
        }
    }
    public static void main(String[] args) {
        Task14 main = new Task14();
        main.recursion(7850);
    }
}