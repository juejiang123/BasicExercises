package List;

public class MyArrayTest {
    private int[] array;
    private int size;

    public MyArrayTest(int capacity){
        this.array = new int[capacity];
        size =0;
    }

    /**
     * 未超数组容量上限
     * @param element
     * @param index
     */
    public void insert(int element,int index){
        try{
            if(index>size || index<0){
                System.out.println("超出数组范围");
            }
            for(int i=size-1;i>=index;i--){
                array[i+1]=array[i];
            }
            array[index]=element;
            size++;
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void insertresize(int element,int index){
        if(index<0 || index>size){
            System.out.println("超出数组范围");
        }
        if(size>=array.length){
//            System.out.println(array.length);
            resize();
        }

        for(int i=size-1;i>=index;i--){
            array[i+1]=array[i];
        }
        array[index]=element;
        size++;
    }

    public int delete(int index){
        if(index<0 || index>size){
            System.out.println("超出数组范围");
        }
        int deleteElement = array[index];
        for(int i=index;i<size;i++){
            array[i]=array[i+1];
        }
        size--;
        return deleteElement;
    }

    public void resize(){
        int[] arrayNew = new int[array.length*2];
        System.arraycopy(array,0,arrayNew,0,array.length);
        array = arrayNew;
    }


    public void output(){
        for(int i=0;i<size;i++){
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        MyArrayTest arrayTest = new MyArrayTest(5);
        arrayTest.insert(2,0);
        arrayTest.insert(3,1);
        arrayTest.insert(2,2);
        arrayTest.insert(5,0);
        arrayTest.insert(9,0);
        arrayTest.output();
        arrayTest.insert(2,0);
        arrayTest.insertresize(8,4);
        arrayTest.output();
        System.out.println("----------");
        arrayTest.delete(4);
        arrayTest.output();
        System.out.println("-------------");
        System.out.println(arrayTest.size);
        System.out.println(arrayTest.array.length);
    }
}
