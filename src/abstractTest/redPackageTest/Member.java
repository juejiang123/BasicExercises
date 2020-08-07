package abstractTest.redPackageTest;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{
    public Member() {
    }

    public Member(String name, int balance) {
        super(name, balance);
    }

    public void receive(ArrayList<Integer> list){
        int i = new Random().nextInt(list.size());
        int delta = list.remove(i);
        super.setBalance(super.getBalance()+delta);
    }
}
