package extendsTest;

public class Fu {

    int numFu = 10;
    int num =100;
    public Fu(){
        this(34);
        System.out.println("父类构造方法");

    }
    public Fu(int i){
        System.out.println(i);
    }

    public void methodFu(){
        System.out.println("Fu");
    }
}
