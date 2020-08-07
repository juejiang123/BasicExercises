package extendsTest;

public class Zi  extends Fu{
    int num =200;
   public Zi(int x){
       super(3);
       System.out.println(x);
   }

    public void methodZi(){
        System.out.println("Zi");
    }

    public void method(){
        int num =300;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
    @Override
    public void methodFu(){
        System.out.println("fu到zi");
        this.method();
    }
}
