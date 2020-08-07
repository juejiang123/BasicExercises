package abstractTest.redPackageTest;

import java.util.ArrayList;

public class RedTest {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",20);
        Member member1 = new Member("成员1",0);
        Member member2 = new Member("成员2",3);
        Member member3 = new Member("成员3",0);
        manager.show();
        member1.show();
        member2.show();
        member3.show();
        ArrayList<Integer> send = manager.send(14, 3);
        member1.receive(send);
        member2.receive(send);
        member3.receive(send);
        manager.show();
        member1.show();
        member2.show();
        member3.show();

    }
}
