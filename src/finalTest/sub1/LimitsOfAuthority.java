package finalTest.sub1;

/*

权限修饰：public > protected > default >private
同一个类   yes        yes        yes      yes
同一个包   yes        yes        yes      no
不同包子类  yes       yes         no       no
不同包非子类 yes       no         no       no
 */
public class LimitsOfAuthority {

    protected int num;
    public String name;
    int age;
    private String sex;

    public void method(){
        System.out.println(sex);
    }
}
