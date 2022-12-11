package ru.mirea.l8;

public class Task3 {
    int B = 5;
    public void recursion(int A) {
        if(A == B) {
            System.out.println(B);
            return ;
        }

        if(A < B) {
            System.out.println(A);
            recursion(A+1);
        } else {
            System.out.println(B);
            B++;
            recursion(A);
        }
    }

    public static void main(String[] args) {
        Task3 o = new Task3();
        o.recursion(0);
    }
}