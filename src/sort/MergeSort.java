package sort;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,3,6,4};
        merge(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void merge(int[] list,int start,int end){
        if(start<end){
            int mid=(start+end)/2;
            merge(list,start,mid);
            merge(list,mid+1,end);
            doMerge(list,start,mid,end);
        }
    }
    public static void doMerge(int[] arr,int start,int mid,int end){
        int[] temp=new int[arr.length];
        int tempIndex=start,index=start;
        int left = start,right= mid+1;
        while (left<=mid && right<=end){
            if(arr[left]<arr[right]){
                temp[tempIndex++] =arr[left++];
            }else {temp[tempIndex++] = arr[right++];}
        }
        while (left<=mid){
            temp[tempIndex++] = arr[left++];
        }
        while (right<=end){
            temp[tempIndex++] = arr[right++];
        }
        for(int i=index;i<=end;i++){
            arr[i]=temp[i];
        }

//        while (index < end){
//            arr[index] = temp[index++];
//        }
    }


}
