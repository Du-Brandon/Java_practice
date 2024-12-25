package practice;

// 此為基礎練習之變數宣告篇
public class J_001 {
    public static void main(String[] args){
        int x = 10;
        System.out.println("x = " + x);

        // long have to add "L" behind the number
        long y = 1000000000000000000L;
        System.out.println("y = " + y);

        // not same as C++, Java will not auto convert the type of variable
        x = (int) (double) (x + 1.1);
        System.out.println("x = " + x);

        // bool is "boolean" in Java
        boolean b = true;
        System.out.println("b = " + b);

    }
}

// Output
/*
PS D:\北科大-專題\Java_practice\Ian> javac practice/J_001.java
PS D:\北科大-專題\Java_practice\Ian> java practice.J_001
x = 10
y = 1000000000000000000
x = 11
b = true
*/