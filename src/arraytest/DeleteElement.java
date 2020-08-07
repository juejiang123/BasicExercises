package arraytest;

public class DeleteElement{
    int size;
    int[] array;

    public DeleteElement(int capacity) {
        this.array = new int[capacity];
        this.size=0;
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
        array[index]=array[size-1];
        size--;

    }
    public static void main(String[] args){
        DeleteElement del= new DeleteElement(10);
        del.insert(1,0);
        del.insert(2,1);
        del.insert(3,2);
        del.insert(4,3);
        del.insert(5,4);
        del.delete(3);
        for (int i=0;i<=del.size-1;i++){
            System.out.println(del.array[i]);
        }


    }
}
