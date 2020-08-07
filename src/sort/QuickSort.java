package sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3,2,4,1,5,6,2};
        quickSort(arr, 0, arr.length - 1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

    public static void quickSort(int[] arr,int first,int end){
        if(first==end){
            return;
        }
        int mid_num = arr[first];
        int low = first;
        int high = end;

        while (low<high){
            while (low<high && arr[high]>=mid_num){
                high--;
            }
            arr[low]=arr[high];
            while (low<high && arr[low]<mid_num){
                low++;
            }
            arr[high]=arr[low];
        }
        arr[low]=mid_num;
        quickSort(arr,first,low-1);
        quickSort(arr,low+1,end);


    }
}
