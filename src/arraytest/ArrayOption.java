package arraytest;

public class ArrayOption {

    private int[] array;
    private int size;

    public ArrayOption(int capacity){
        this.array = new int[capacity];
        size = 0;
    }

    public void insert(int element,int index){
        if(index<0 || index>size){
            throw new IndexOutOfBoundsException("超出数组实际元素范围");
        }
        for(int i=size-1;i>=index;i--){
            array[i+1]=array[i];
        }
        array[index]=element;
        size++;
    }

    public void delete(int index){
        if(index<0 || index>size){
            throw new IndexOutOfBoundsException("超出数组实际元素范围");
        }
        for(int i=index;i<=size-1;i++){
            array[i]=array[i+1];
        }
        size--;
    }
    public void output(){
        for(int i=0;i<=size-1;i++){
            System.out.print(array[i]);
        }
    }
    public static void main(String[] args)throws IndexOutOfBoundsException{
        ArrayOption arrayOption = new ArrayOption(10);
        arrayOption.insert(3,0);
        arrayOption.insert(2,1);
        arrayOption.insert(6,2);
        arrayOption.insert(1,3);
        arrayOption.insert(5,2);
        int size = arrayOption.size;
        System.out.println(size);
        System.out.println("-----------");
//        int[] array = arrayOption.array;
//        for(int i:array){
//            System.out.println(i);
//        }
//        System.out.println("-----------------");
//        System.out.println(array);
        arrayOption.delete(3);
        arrayOption.delete(3);
//        arrayOption.delete(2);
        System.out.println(arrayOption.size);
        arrayOption.output();

    }
}
