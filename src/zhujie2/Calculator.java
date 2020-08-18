package zhujie2;

public class Calculator {
    public String age;
    private String name;
    String sex;
    protected int num;

    @check
    public void add(){
        System.out.println("1+0="+(1+0));
    }

    @check
    public void sub(){
        System.out.println("1-0="+(1-0));
    }

    @check
    public void mul(){
        System.out.println("1*0="+(1*0));
    }

    @check
    public void div(){
        System.out.println("1/0="+(1/0));
    }
}
