package practice_002;

// 想說基本語法沒有特別不一樣，所以直接跳至
// class 應用

/*
after compile J_002.java,
it would gernerate Name1.class, Name2.class, and J_002.class

但如果執行的class中沒有main function時 無法執行該class
=〉 不能執行 Name1 and Name2


static =>



*/
public class J_002 {
    static int x = 2;
    public static void main(String[] args){
        System.out.println("J_002.x = " + J_002.x);
        System.out.println("Name1.x = " + Name1.x);
        System.out.println("Name1.text = " + Name1.text);
    }
}

class Name1 {
    static int x = 5;
    static String text = "Hello World!";
}

class Name2 {

}