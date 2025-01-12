public class test {
    public static void main(String[] args){
        // 整數:byte, short, int, long
        // float, double
        // char or '' = 字元
        // String or "" 字串
        int a=3;
        System.out.println(a);

        // 數字預設為int
        System.out.println(22000);
        System.out.println(200000000000L); //加L變為long
        // 小數預設為double
        System.out.println(3.141592653);
        System.out.println(3.141592653F); //加L變為long

        // java不接受大型別轉小(EX:int a = 3 byte b = a),但可以強制定型
        byte b = (byte)a;
        System.out.println(b);

        // 不接受 int c = 5/2.0 (不同型別運算)
        // 
    }
    
}

