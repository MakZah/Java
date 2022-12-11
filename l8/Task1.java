package ru.mirea.l8;

public class Task1 {
    int n = 1;
    public void recursion(int N) {
        if(N == 0) {
            return ;
        }

        for(int i = 0; i < n; i++) {
            System.out.println(n);
        }

        n++;

        recursion(N - 1);
    }

    public static void main(String[] args) {
        Task1 rec = new Task1();
        rec.recursion(5);
    }
}