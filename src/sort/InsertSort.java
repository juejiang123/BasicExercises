package sort;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {3,2,4,1,6,3,6,3};
        Insert(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void Insert(int[] arr){
        int temp =0;
        for(int j=1;j<arr.length;j++){
            int i =j;
            while (i>0){
                if(arr[i]<arr[i-1]){
                    temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                    i--;
                }else{
                    break;
                }
        }


        }
    }
}
