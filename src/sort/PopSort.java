package sort;

public class PopSort {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //int a = in.nextInt();
        //System.out.println(a);
        int[] arr = new int[]{2,1,5,4};
        sort(arr);
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }

    }
    public static void sort(int[] arr){
        int temp = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[j];
                    arr[j]= arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}