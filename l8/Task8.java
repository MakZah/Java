package ru.mirea.l8;

public class Task8 {
    public void recursion(String pal) {
        if(pal.length() == 0 || pal.length() == 1) {
            System.out.println("TRUE");
            return ;
        }

        StringBuffer stringBuffer = new StringBuffer(pal);

        if(stringBuffer.charAt(0) == stringBuffer.charAt(stringBuffer.length() - 1) && stringBuffer.length() > 1) {
            stringBuffer.deleteCharAt(0);
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);

            String next = stringBuffer.toString();

            recursion(next);
        } else {
            System.out.println("FALSE");
            return ;
        }
    }

    public static void main(String[] args) {
        Task8 pal = new Task8();
        pal.recursion("gaag");
    }
}