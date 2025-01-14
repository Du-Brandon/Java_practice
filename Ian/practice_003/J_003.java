package practice_003;

import java.util.Scanner;
// 輸入輸出練習
// 配合scanner => Java 的標準輸入輸出
// 透過import java.util.Scanner; 來引入
// Scanner s = new Scanner(System.in); => 產生一個scanner物件
// s.nextLine(); => 讀取一行字串
// s.nextInt(); => 讀取一個整數
// s.nextDouble(); => 讀取一個浮點數
// s.close(); => 關閉scanner物件
// 要記得不用 scanner 物件時要記得關閉
// 用try可以確保不出錯時也會關閉 

/*
而關於陣列的宣告
需要透過int[] arr = new int[陣列長度]; 來宣告
使用方式跟C++一樣
*/

public class J_003 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Please enter your name: ");
            String userName = s.nextLine();
            System.out.println("Hello, " + userName + "!");
            
            
            System.out.print("輸入陣列長度：");
            int l = s.nextInt();
            int[] arr = new int[l];
            int x = 0;
            for(int i=0;i<l;i++){
                arr[x++] = s.nextInt();
                // J_003.print(x);
            }
            for (int i=0;i<=l;i++) {
                System.out.println("arr[" + i + "] = " + arr[i]);
            }
        }
    }
    public static void print(String text){
        System.out.println(text);
    }
    public static void print(int text){
        System.out.println(text);
    }
}
