public class array_test {
    public static void main(String[] args){

        // array 要用 new 來初始化
        String[] a;
        a = new String[10];
        int[] x = new int[3];

        System.out.println(a.length); // .length 可以取得陣列大小

        // 可以用以下方式塞入新的值(不用定義大小)
        int [] y = new int[]{11,45,14};

    }
}