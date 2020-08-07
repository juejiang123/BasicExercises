package arraytest;

public class ShuZuTest {
    public static void main(String[] args) {
        int[] arr = new int[]{};
        if(arr == null){
            System.out.println("arr kong");
        }
        int[] arr1 = null;
        if(arr1==null){
            System.out.println("null");
        }

        System.out.println(arr.length);
//        arr[0]=0;
//        if(arr == null){
//            System.out.println(arr);
//        }
        System.out.println("-----------------------------");
        int[][] array2 = new int[][]{{}}; //被当成 {{0},{},{}}
        if (array2 == null) {
            System.out.println("array2 == null");
        }
        System.out.println(array2.length);//行数
        if (array2.length == 0) {
            System.out.println("array2.length == 0");
        }
        if (array2[0].length == 0) {//第一行的长度
            System.out.println("array2[0].length == 0");
        }
        System.out.println("-----------------------------");
        Integer[] array3 = new Integer[]{}; //被当成 {0}
        if (array3 == null) {
            System.out.println("array3 == null");
        }
        System.out.println(array3.length);//行数
        if (array3.length == 0) {
            System.out.println("array3.length == 0");
        }
        System.out.println("-----------------------------");
        int[][] array4 = new int[][]{{}}; //被当成 {{0},{},{}}
        if (array4 == null) {
            System.out.println("array4 == null");
        }
        System.out.println(array4.length);//行数
        if (array4.length == 0) {
            System.out.println("array4.length == 0");
        }
        if (array4[0].length == 0) {//第一行的长度
            System.out.println("array4[0].length == 0");
        }

    }
}
